package j.com.example.android.theappraisallanehremployee

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import com.facebook.drawee.view.SimpleDraweeView
import j.com.example.android.theappraisallanehremployee.model.Employee
import kotlinx.android.synthetic.main.employee_view_holder.view.*

class EmployeeViewHolder(itemView: View, var context: Context, var callback: EmployeeCallback) :
    RecyclerView.ViewHolder(itemView) {

    @BindView(R.id.employeeImageView)
    lateinit var itemText: SimpleDraweeView

    @BindView(R.id.fullNameTextView)
    lateinit var fullName: TextView

    @BindView(R.id.birthdayTextView)
    lateinit var birthday: TextView

    fun bind(employee: Employee) {
        ButterKnife.bind(this, itemView)
        itemView.fullNameTextView.text = employee.fullName?.getFullName()
        itemView.birthdayTextView.text = employee.birthdate?.date

        itemView.setOnClickListener {
            employee.id?.let { it1 -> callback.onClick(it1) }
        }
    }
}