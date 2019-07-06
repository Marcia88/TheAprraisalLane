package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName

class Login {

    @SerializedName("username")
    var username: String? = null

    @SerializedName("password")
    var password: String? = null
}