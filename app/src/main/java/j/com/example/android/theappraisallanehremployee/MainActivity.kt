package j.com.example.android.theappraisallanehremployee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.drawee.backends.pipeline.Fresco
import j.com.example.android.theappraisallanehremployee.databinding.EmployeesBinding
import j.com.example.android.theappraisallanehremployee.model.Employee
import kotlinx.android.synthetic.main.employees.*


class MainActivity : AppCompatActivity(), EmployeeCallback {
    private lateinit var employeeViewModel: EmployeeViewModel
    private lateinit var binding: EmployeesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.employees)

        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.employeeList.layoutManager = layoutManager
        employeeViewModel = EmployeeViewModel(this)
        binding.employeeViewModel = employeeViewModel
        employeeViewModel.loadEmployees()

        val dividerItemDecoration = DividerItemDecoration(
            employeeList.context,
            layoutManager.orientation
        )
        employeeList.addItemDecoration(dividerItemDecoration)

        Fresco.initialize(this)
    }

    override fun onClick(employee: Employee) {
        val intent = Intent(this, EmployeeDetailActivity::class.java)
        intent.putExtra(ConstantValues.EMPLOYEE, employee)
        startActivity(intent)
    }
}
