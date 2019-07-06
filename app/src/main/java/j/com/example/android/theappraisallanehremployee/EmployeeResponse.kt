package j.com.example.android.theappraisallanehremployee

import com.google.gson.annotations.SerializedName
import j.com.example.android.theappraisallanehremployee.model.Employee

data class EmployeeResponse(@SerializedName(value = "results") val employees: List<Employee>)

