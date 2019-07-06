package j.com.example.android.theappraisallanehremployee

import android.Manifest.permission
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import j.com.example.android.theappraisallanehremployee.ConstantValues.EMPLOYEE
import j.com.example.android.theappraisallanehremployee.databinding.EmployeeDetailBinding
import j.com.example.android.theappraisallanehremployee.model.Employee
import kotlinx.android.synthetic.main.basic_info.*
import kotlinx.android.synthetic.main.contact_info.*
import kotlinx.android.synthetic.main.extended_info.*
import androidx.core.content.ContextCompat.startActivity
import java.util.*


class EmployeeDetailActivity : Activity(), EmployeeDetailCallback {

    private val REQUEST_PHONE_CALL: Int = 1
    private lateinit var binding: EmployeeDetailBinding
    private lateinit var employee: Employee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.employee_detail)

        employee = intent?.extras?.getSerializable(EMPLOYEE) as Employee
        employee?.let { loadEmployeeDetail(it) }
    }

    private fun loadEmployeeDetail(employee: Employee) {
        fullname.text = employee.fullName?.getFullName()
        birthdate.text = employee.birthdate?.date
        address.text = employee.location?.getLocation()
        userName.text = employee.login?.username
        password.text = employee.login?.password
        phoneNumber.text = employee.phone
        email.text = employee.email


        val uri = Uri.parse(employee.picture?.image)
        picture.setImageURI(uri)
    }

    fun call(view: View) {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + employee.phone))
        if (ContextCompat.checkSelfPermission(this, permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(permission.CALL_PHONE), REQUEST_PHONE_CALL)
        } else {
            startActivity(intent)
        }
    }

    fun sendMail(view: View) {
        val mailClient = Intent(Intent.ACTION_VIEW)
        mailClient.setClassName("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail")
        startActivity(mailClient)
    }

    fun openGMaps(view: View){
        val lat = employee.location?.coordinates?.latitude
        val lng = employee.location?.coordinates?.longitude
        val t = employee.location?.city

        val geoUri = "http://maps.google.com/maps?q=loc:$lat,$lng ($t)"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(geoUri))
        startActivity(intent)
    }
}