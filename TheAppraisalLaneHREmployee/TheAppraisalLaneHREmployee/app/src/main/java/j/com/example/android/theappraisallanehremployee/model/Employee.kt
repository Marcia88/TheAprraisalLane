package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Employee : Serializable {

    @SerializedName(value = "picture")
    var picture: Picture? = null

    @SerializedName(value = "name")
    var fullName: FullName? = null

    @SerializedName(value = "dob")
    var birthdate: Dob? = null

    @SerializedName(value = "login")
    var login: Login? = null

    @SerializedName(value = "location")
    var location: Location? = null

    @SerializedName(value = "id")
    var id: Id? = null

    @SerializedName(value = "phone")
    var phone: String? = null

    @SerializedName(value = "email")
    var email: String? = null

}