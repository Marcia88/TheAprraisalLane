package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName

class Location {

    @SerializedName("street")
    var street: String? = null

    @SerializedName("city")
    var city: String? = null

    @SerializedName("coordinates")
    var coordinates: Coordinates? = null

    inner class Coordinates{

        @SerializedName("latitude")
        var latitude: String? = null

        @SerializedName("longitude")
        var longitude: String? = null
    }
}