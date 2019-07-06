package j.com.example.android.theappraisallanehremployee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.facebook.drawee.backends.pipeline.Fresco
import j.com.example.android.theappraisallanehremployee.databinding.EmployeesBinding
import j.com.example.android.theappraisallanehremployee.model.Id



class MainActivity : AppCompatActivity(), EmployeeCallback {
    private lateinit var employeeViewModel: EmployeeViewModel
    private lateinit var binding: EmployeesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.employees)
        employeeViewModel = EmployeeViewModel(this)
        binding.employeeViewModel = employeeViewModel
        Fresco.initialize(this)
        employeeViewModel.loadEmployees()
    }

    override fun onClick(id: Id) {
        val intent = Intent(this, EmployeeDetailActivity::class.java)
        intent.putExtra("id", id.value)
        startActivity(intent)
    }
}
