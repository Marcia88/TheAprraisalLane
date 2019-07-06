package j.com.example.android.theappraisallanehremployee.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Id: Serializable {
    @SerializedName(value = "name")
    var name: String? = null

    @SerializedName(value = "value")
    var value: String? = null

}