
import com.google.gson.annotations.SerializedName

data class ReposUrl(
    @SerializedName("examples")
    val examples: List<String>,
    @SerializedName("format")
    val format: String,
    @SerializedName("type")
    val type: String
)