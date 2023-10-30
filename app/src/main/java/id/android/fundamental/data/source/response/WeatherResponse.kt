package id.android.fundamental.data.source.response

import com.google.gson.annotations.SerializedName

data class WeatherResponse(

	@field:SerializedName("timelines")
	val timelines: Timelines? = null,

	@field:SerializedName("location")
	val location: Location? = null
)

data class Timelines(

	@field:SerializedName("daily")
	val daily: List<DailyItem?>? = null,

	@field:SerializedName("hourly")
	val hourly: List<HourlyItem?>? = null,

	@field:SerializedName("minutely")
	val minutely: List<MinutelyItem?>? = null
)

data class Location(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("lon")
	val lon: Any? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("lat")
	val lat: Any? = null
)

data class Values(

	@field:SerializedName("moonriseTime")
	val moonriseTime: String? = null,

	@field:SerializedName("sleetAccumulationMax")
	val sleetAccumulationMax: Int? = null,

	@field:SerializedName("snowAccumulationLweMax")
	val snowAccumulationLweMax: Int? = null,

	@field:SerializedName("cloudCoverAvg")
	val cloudCoverAvg: Any? = null,

	@field:SerializedName("cloudCoverMin")
	val cloudCoverMin: Int? = null,

	@field:SerializedName("uvHealthConcernAvg")
	val uvHealthConcernAvg: Int? = null,

	@field:SerializedName("uvHealthConcernMin")
	val uvHealthConcernMin: Int? = null,

	@field:SerializedName("cloudCeilingAvg")
	val cloudCeilingAvg: Any? = null,

	@field:SerializedName("cloudCeilingMin")
	val cloudCeilingMin: Int? = null,

	@field:SerializedName("windGustAvg")
	val windGustAvg: Any? = null,

	@field:SerializedName("windGustMin")
	val windGustMin: Any? = null,

	@field:SerializedName("iceAccumulationMax")
	val iceAccumulationMax: Int? = null,

	@field:SerializedName("weatherCodeMax")
	val weatherCodeMax: Int? = null,

	@field:SerializedName("snowAccumulationLweAvg")
	val snowAccumulationLweAvg: Int? = null,

	@field:SerializedName("snowAccumulationLweMin")
	val snowAccumulationLweMin: Int? = null,

	@field:SerializedName("iceAccumulationAvg")
	val iceAccumulationAvg: Int? = null,

	@field:SerializedName("iceAccumulationMin")
	val iceAccumulationMin: Int? = null,

	@field:SerializedName("dewPointAvg")
	val dewPointAvg: Any? = null,

	@field:SerializedName("dewPointMin")
	val dewPointMin: Any? = null,

	@field:SerializedName("cloudCeilingMax")
	val cloudCeilingMax: Any? = null,

	@field:SerializedName("humidityMax")
	val humidityMax: Any? = null,

	@field:SerializedName("freezingRainIntensityAvg")
	val freezingRainIntensityAvg: Int? = null,

	@field:SerializedName("freezingRainIntensityMin")
	val freezingRainIntensityMin: Int? = null,

	@field:SerializedName("weatherCodeMin")
	val weatherCodeMin: Int? = null,

	@field:SerializedName("pressureSurfaceLevelMax")
	val pressureSurfaceLevelMax: Any? = null,

	@field:SerializedName("windDirectionAvg")
	val windDirectionAvg: Any? = null,

	@field:SerializedName("temperatureAvg")
	val temperatureAvg: Any? = null,

	@field:SerializedName("uvHealthConcernMax")
	val uvHealthConcernMax: Int? = null,

	@field:SerializedName("temperatureMin")
	val temperatureMin: Any? = null,

	@field:SerializedName("snowAccumulationMax")
	val snowAccumulationMax: Int? = null,

	@field:SerializedName("dewPointMax")
	val dewPointMax: Any? = null,

	@field:SerializedName("humidityAvg")
	val humidityAvg: Any? = null,

	@field:SerializedName("humidityMin")
	val humidityMin: Int? = null,

	@field:SerializedName("snowAccumulationSum")
	val snowAccumulationSum: Int? = null,

	@field:SerializedName("windSpeedMax")
	val windSpeedMax: Any? = null,

	@field:SerializedName("windGustMax")
	val windGustMax: Any? = null,

	@field:SerializedName("snowAccumulationAvg")
	val snowAccumulationAvg: Int? = null,

	@field:SerializedName("snowAccumulationMin")
	val snowAccumulationMin: Int? = null,

	@field:SerializedName("freezingRainIntensityMax")
	val freezingRainIntensityMax: Int? = null,

	@field:SerializedName("temperatureMax")
	val temperatureMax: Any? = null,

	@field:SerializedName("snowIntensityAvg")
	val snowIntensityAvg: Int? = null,

	@field:SerializedName("snowIntensityMin")
	val snowIntensityMin: Int? = null,

	@field:SerializedName("temperatureApparentAvg")
	val temperatureApparentAvg: Any? = null,

	@field:SerializedName("temperatureApparentMin")
	val temperatureApparentMin: Any? = null,

	@field:SerializedName("uvIndexAvg")
	val uvIndexAvg: Int? = null,

	@field:SerializedName("uvIndexMin")
	val uvIndexMin: Int? = null,

	@field:SerializedName("windSpeedMin")
	val windSpeedMin: Any? = null,

	@field:SerializedName("windSpeedAvg")
	val windSpeedAvg: Any? = null,

	@field:SerializedName("rainAccumulationLweAvg")
	val rainAccumulationLweAvg: Int? = null,

	@field:SerializedName("rainAccumulationLweMin")
	val rainAccumulationLweMin: Int? = null,

	@field:SerializedName("rainAccumulationSum")
	val rainAccumulationSum: Any? = null,

	@field:SerializedName("rainIntensityMin")
	val rainIntensityMin: Int? = null,

	@field:SerializedName("sleetAccumulationLweSum")
	val sleetAccumulationLweSum: Int? = null,

	@field:SerializedName("sunsetTime")
	val sunsetTime: String? = null,

	@field:SerializedName("rainIntensityAvg")
	val rainIntensityAvg: Int? = null,

	@field:SerializedName("moonsetTime")
	val moonsetTime: Any? = null,

	@field:SerializedName("pressureSurfaceLevelAvg")
	val pressureSurfaceLevelAvg: Any? = null,

	@field:SerializedName("pressureSurfaceLevelMin")
	val pressureSurfaceLevelMin: Any? = null,

	@field:SerializedName("temperatureApparentMax")
	val temperatureApparentMax: Any? = null,

	@field:SerializedName("uvIndexMax")
	val uvIndexMax: Int? = null,

	@field:SerializedName("evapotranspirationMax")
	val evapotranspirationMax: Any? = null,

	@field:SerializedName("sleetAccumulationLweAvg")
	val sleetAccumulationLweAvg: Int? = null,

	@field:SerializedName("sleetAccumulationLweMin")
	val sleetAccumulationLweMin: Int? = null,

	@field:SerializedName("rainAccumulationAvg")
	val rainAccumulationAvg: Int? = null,

	@field:SerializedName("rainAccumulationMin")
	val rainAccumulationMin: Int? = null,

	@field:SerializedName("sleetIntensityMax")
	val sleetIntensityMax: Int? = null,

	@field:SerializedName("snowIntensityMax")
	val snowIntensityMax: Int? = null,

	@field:SerializedName("sunriseTime")
	val sunriseTime: String? = null,

	@field:SerializedName("iceAccumulationSum")
	val iceAccumulationSum: Int? = null,

	@field:SerializedName("evapotranspirationSum")
	val evapotranspirationSum: Any? = null,

	@field:SerializedName("rainIntensityMax")
	val rainIntensityMax: Any? = null,

	@field:SerializedName("precipitationProbabilityMax")
	val precipitationProbabilityMax: Int? = null,

	@field:SerializedName("visibilityMax")
	val visibilityMax: Int? = null,

	@field:SerializedName("rainAccumulationLweMax")
	val rainAccumulationLweMax: Any? = null,

	@field:SerializedName("sleetIntensityAvg")
	val sleetIntensityAvg: Int? = null,

	@field:SerializedName("sleetIntensityMin")
	val sleetIntensityMin: Int? = null,

	@field:SerializedName("evapotranspirationAvg")
	val evapotranspirationAvg: Any? = null,

	@field:SerializedName("evapotranspirationMin")
	val evapotranspirationMin: Any? = null,

	@field:SerializedName("cloudBaseAvg")
	val cloudBaseAvg: Any? = null,

	@field:SerializedName("cloudBaseMin")
	val cloudBaseMin: Int? = null,

	@field:SerializedName("iceAccumulationLweMax")
	val iceAccumulationLweMax: Int? = null,

	@field:SerializedName("rainAccumulationMax")
	val rainAccumulationMax: Any? = null,

	@field:SerializedName("sleetAccumulationLweMax")
	val sleetAccumulationLweMax: Int? = null,

	@field:SerializedName("snowAccumulationLweSum")
	val snowAccumulationLweSum: Int? = null,

	@field:SerializedName("visibilityAvg")
	val visibilityAvg: Any? = null,

	@field:SerializedName("precipitationProbabilityAvg")
	val precipitationProbabilityAvg: Any? = null,

	@field:SerializedName("precipitationProbabilityMin")
	val precipitationProbabilityMin: Int? = null,

	@field:SerializedName("visibilityMin")
	val visibilityMin: Any? = null,

	@field:SerializedName("sleetAccumulationAvg")
	val sleetAccumulationAvg: Int? = null,

	@field:SerializedName("sleetAccumulationMin")
	val sleetAccumulationMin: Int? = null,

	@field:SerializedName("cloudCoverMax")
	val cloudCoverMax: Int? = null,

	@field:SerializedName("iceAccumulationLweSum")
	val iceAccumulationLweSum: Int? = null,

	@field:SerializedName("cloudBaseMax")
	val cloudBaseMax: Any? = null,

	@field:SerializedName("iceAccumulationLweAvg")
	val iceAccumulationLweAvg: Int? = null,

	@field:SerializedName("iceAccumulationLweMin")
	val iceAccumulationLweMin: Int? = null,

	@field:SerializedName("precipitationProbability")
	val precipitationProbability: Int? = null,

	@field:SerializedName("snowIntensity")
	val snowIntensity: Int? = null,

	@field:SerializedName("snowAccumulation")
	val snowAccumulation: Int? = null,

	@field:SerializedName("visibility")
	val visibility: Int? = null,

	@field:SerializedName("freezingRainIntensity")
	val freezingRainIntensity: Int? = null,

	@field:SerializedName("windGust")
	val windGust: Any? = null,

	@field:SerializedName("rainIntensity")
	val rainIntensity: Int? = null,

	@field:SerializedName("temperatureApparent")
	val temperatureApparent: Any? = null,

	@field:SerializedName("weatherCode")
	val weatherCode: Int? = null,

	@field:SerializedName("cloudCover")
	val cloudCover: Int? = null,

	@field:SerializedName("evapotranspiration")
	val evapotranspiration: Any? = null,

	@field:SerializedName("pressureSurfaceLevel")
	val pressureSurfaceLevel: Any? = null,

	@field:SerializedName("dewPoint")
	val dewPoint: Any? = null,

	@field:SerializedName("sleetIntensity")
	val sleetIntensity: Int? = null,

	@field:SerializedName("iceAccumulation")
	val iceAccumulation: Int? = null,

	@field:SerializedName("sleetAccumulation")
	val sleetAccumulation: Int? = null,

	@field:SerializedName("cloudBase")
	val cloudBase: Any? = null,

	@field:SerializedName("temperature")
	val temperature: Any? = null,

	@field:SerializedName("humidity")
	val humidity: Int? = null,

	@field:SerializedName("windDirection")
	val windDirection: Any? = null,

	@field:SerializedName("windSpeed")
	val windSpeed: Any? = null,

	@field:SerializedName("rainAccumulation")
	val rainAccumulation: Int? = null,

	@field:SerializedName("cloudCeiling")
	val cloudCeiling: Any? = null,

	@field:SerializedName("snowAccumulationLwe")
	val snowAccumulationLwe: Int? = null,

	@field:SerializedName("rainAccumulationLwe")
	val rainAccumulationLwe: Int? = null,

	@field:SerializedName("sleetAccumulationLwe")
	val sleetAccumulationLwe: Int? = null,

	@field:SerializedName("iceAccumulationLwe")
	val iceAccumulationLwe: Int? = null,

	@field:SerializedName("uvHealthConcern")
	val uvHealthConcern: Int? = null,

	@field:SerializedName("uvIndex")
	val uvIndex: Int? = null
)

data class DailyItem(

	@field:SerializedName("values")
	val values: Values? = null,

	@field:SerializedName("time")
	val time: String? = null
)

data class HourlyItem(

	@field:SerializedName("values")
	val values: Values? = null,

	@field:SerializedName("time")
	val time: String? = null
)

data class MinutelyItem(

	@field:SerializedName("values")
	val values: Values? = null,

	@field:SerializedName("time")
	val time: String? = null
)
