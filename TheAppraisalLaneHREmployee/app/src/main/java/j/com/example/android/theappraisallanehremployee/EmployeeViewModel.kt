package j.com.example.android.theappraisallanehremployee

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class EmployeeViewModel(employeeCallback: EmployeeCallback) {
    var adapter = EmployeeAdapter(employeeCallback)
    private val disposable = CompositeDisposable()

    fun loadEmployees() {
        fun load() {

            disposable.add(GetEmployeeService.getEmployeesService().getEmployees()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    adapter.loadEmployees(employeesResult = result)
                },
                    { error ->
                        //TODO:display error activity
                    }
                ))
        }
    }
}