package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Login: Serializable {

    @SerializedName("username")
    var username: String? = null

    @SerializedName("password")
    var password: String? = null
}