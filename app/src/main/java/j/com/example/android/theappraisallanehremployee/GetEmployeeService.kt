package j.com.example.android.theappraisallanehremployee

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object GetEmployeeService {
    private var retrofit: Retrofit
    private const val BASE_URL = "https://randomuser.me/api/"

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getEmployeesService(): GetEmployeeInterface = retrofit.create(GetEmployeeInterface::class.java)
}