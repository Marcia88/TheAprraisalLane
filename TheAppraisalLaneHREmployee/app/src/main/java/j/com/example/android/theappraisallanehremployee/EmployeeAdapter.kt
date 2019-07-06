package j.com.example.android.theappraisallanehremployee

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import j.com.example.android.theappraisallanehremployee.model.Employee

class EmployeeAdapter(private val callback: EmployeeCallback) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var employees: List<Employee>

    fun loadEmployees(employeesResult: EmployeeResponse) {
        this.employees = employeesResult.employees
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.employee_view_holder, parent, false)
        return EmployeeViewHolder(view, parent.context, callback)
    }

    override fun getItemCount(): Int {
        return employees.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (employees.isNotEmpty()) {
            (holder as EmployeeViewHolder).bind(employees[position])
        }
    }
}