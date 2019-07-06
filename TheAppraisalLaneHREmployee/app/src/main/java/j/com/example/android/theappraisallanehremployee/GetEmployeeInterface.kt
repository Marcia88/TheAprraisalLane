package j.com.example.android.theappraisallanehremployee

import io.reactivex.Single
import retrofit2.http.GET

interface GetEmployeeInterface {
    @GET("payment_methods.js")
    fun getEmployees(): Single<EmployeeResponse>
}