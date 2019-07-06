package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName

class Employee {
    @SerializedName(value = "picture")
    val picture: Picture? = null

    @SerializedName(value = "name")
    val fullName: FullName? = null

    @SerializedName(value = "dob")
    val birthdate: Dob? = null

    @SerializedName(value = "login")
    val login: Login? = null

    @SerializedName(value = "location")
    val location: Location? = null

    @SerializedName(value = "id")
    val id: Id? = null


}