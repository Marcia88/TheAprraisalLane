package j.com.example.android.theappraisallanehremployee

import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import butterknife.ButterKnife
import com.facebook.drawee.view.SimpleDraweeView
import j.com.example.android.theappraisallanehremployee.model.Employee
import kotlinx.android.synthetic.main.employee_view_holder.view.*


class EmployeeViewHolder(itemView: View, var callback: EmployeeCallback) :
    RecyclerView.ViewHolder(itemView) {

    fun bind(employee: Employee) {
        ButterKnife.bind(this, itemView)

        itemView.fullNameTextView.text = employee.fullName?.getFullName()
        itemView.birthdayTextView.text = employee.birthdate?.date

        val uri = Uri.parse(employee.picture?.image)
        (itemView.employeeImageView as SimpleDraweeView).setImageURI(uri)

        itemView.setOnClickListener {
            callback.onClick(employee)
        }
    }
}