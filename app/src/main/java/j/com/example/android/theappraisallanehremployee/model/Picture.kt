package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Picture :Serializable {

    @SerializedName("medium")
    var image: String? = null
}