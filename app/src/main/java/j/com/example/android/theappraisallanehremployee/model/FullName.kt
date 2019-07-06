package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName
import j.com.example.android.theappraisallanehremployee.ConstantValues.SPACE
import java.io.Serializable

class FullName: Serializable {

    @SerializedName(value = "title")
    var title: String? = null

    @SerializedName(value = "first")
    var first: String? = null

    @SerializedName(value = "last")
    var last: String? = null

    fun getFullName(): String {
        return title + SPACE + first + SPACE + last
    }
}