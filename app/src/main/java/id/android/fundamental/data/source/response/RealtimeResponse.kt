package id.android.fundamental.data.source.response

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("location")
	val location: Location? = null
)

data class Data(

	@field:SerializedName("values")
	val values: Values? = null,

	@field:SerializedName("time")
	val time: String? = null
)

