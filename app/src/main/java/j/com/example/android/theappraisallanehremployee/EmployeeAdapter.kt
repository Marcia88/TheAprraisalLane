package j.com.example.android.theappraisallanehremployee

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import j.com.example.android.theappraisallanehremployee.model.Employee

class EmployeeAdapter(private val callback: EmployeeCallback) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var employees: List<Employee>

    fun loadEmployees(employeesResult: EmployeeResponse) {
        this.employees = employeesResult.employees
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.employee_view_holder, parent, false)
        return EmployeeViewHolder(view, callback)
    }

    override fun getItemCount(): Int {
        return if (::employees.isInitialized) employees.size else 0
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (employees.isNotEmpty()) {
            (holder as EmployeeViewHolder).bind(employees[position])
        }
    }
}