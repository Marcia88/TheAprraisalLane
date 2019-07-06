package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName
import j.com.example.android.theappraisallanehremployee.ConstantValues.SPACE
import java.io.Serializable

class Location : Serializable {

    @SerializedName("street")
    var street: String? = null

    @SerializedName("city")
    var city: String? = null

    fun getLocation(): String {
        return city + SPACE + street
    }

    @SerializedName("coordinates")
    var coordinates: Coordinates? = null



    inner class Coordinates : Serializable {

        @SerializedName("latitude")
        var latitude: String? = null

        @SerializedName("longitude")
        var longitude: String? = null
    }
}