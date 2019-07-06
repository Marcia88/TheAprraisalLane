package j.com.example.android.theappraisallanehremployee

import io.reactivex.Single
import retrofit2.http.GET

interface GetEmployeeInterface {
    @GET("?results=20")
    fun getEmployees(): Single<EmployeeResponse>
}