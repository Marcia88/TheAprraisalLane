package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName

class FullName {

    @SerializedName(value = "title")
    val title: String? = null

    @SerializedName(value = "first")
    val first: String? = null

    @SerializedName(value = "last")
    val last: String? = null

    fun getFullName(): String{
        return title + first + last
    }
}