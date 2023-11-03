package id.android.fundamental.data.source.response

import com.google.gson.annotations.SerializedName

data class ForecastResponse(

	@field:SerializedName("timelines")
	val timelines: Timelines? = null,

	@field:SerializedName("location")
	val location: Location? = null
)

data class HourlyItem(

	@field:SerializedName("values")
	val values: Values? = null,

	@field:SerializedName("time")
	val time: String? = null
)

data class Timelines(

	@field:SerializedName("daily")
	val daily: List<DailyItem?>? = null,

	@field:SerializedName("hourly")
	val hourly: List<HourlyItem?>? = null,

	@field:SerializedName("minutely")
	val minutely: List<MinutelyItem?>? = null
)

data class DailyItem(

	@field:SerializedName("values")
	val values: Values? = null,

	@field:SerializedName("time")
	val time: String? = null
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

data class MinutelyItem(

	@field:SerializedName("values")
	val values: Values? = null,

	@field:SerializedName("time")
	val time: String? = null
)

data class Values(

	@field:SerializedName("moonriseTime")
	val moonriseTime: String? = null,

	@field:SerializedName("sleetAccumulationMax")
	val sleetAccumulationMax: Any? = null,

	@field:SerializedName("snowAccumulationLweMax")
	val snowAccumulationLweMax: Any? = null,

	@field:SerializedName("cloudCoverAvg")
	val cloudCoverAvg: Any? = null,

	@field:SerializedName("cloudCoverMin")
	val cloudCoverMin: Any? = null,

	@field:SerializedName("uvHealthConcernAvg")
	val uvHealthConcernAvg: Any? = null,

	@field:SerializedName("uvHealthConcernMin")
	val uvHealthConcernMin: Any? = null,

	@field:SerializedName("cloudCeilingAvg")
	val cloudCeilingAvg: Any? = null,

	@field:SerializedName("cloudCeilingMin")
	val cloudCeilingMin: Any? = null,

	@field:SerializedName("windGustAvg")
	val windGustAvg: Any? = null,

	@field:SerializedName("windGustMin")
	val windGustMin: Any? = null,

	@field:SerializedName("iceAccumulationMax")
	val iceAccumulationMax: Any? = null,

	@field:SerializedName("weatherCodeMax")
	val weatherCodeMax: Any? = null,

	@field:SerializedName("snowAccumulationLweAvg")
	val snowAccumulationLweAvg: Any? = null,

	@field:SerializedName("snowAccumulationLweMin")
	val snowAccumulationLweMin: Any? = null,

	@field:SerializedName("iceAccumulationAvg")
	val iceAccumulationAvg: Any? = null,

	@field:SerializedName("iceAccumulationMin")
	val iceAccumulationMin: Any? = null,

	@field:SerializedName("dewPointAvg")
	val dewPointAvg: Any? = null,

	@field:SerializedName("dewPointMin")
	val dewPointMin: Any? = null,

	@field:SerializedName("cloudCeilingMax")
	val cloudCeilingMax: Any? = null,

	@field:SerializedName("humidityMax")
	val humidityMax: Any? = null,

	@field:SerializedName("freezingRainAnyensityAvg")
	val freezingRainAnyensityAvg: Any? = null,

	@field:SerializedName("freezingRainAnyensityMin")
	val freezingRainAnyensityMin: Any? = null,

	@field:SerializedName("weatherCodeMin")
	val weatherCodeMin: Any? = null,

	@field:SerializedName("pressureSurfaceLevelMax")
	val pressureSurfaceLevelMax: Any? = null,

	@field:SerializedName("windDirectionAvg")
	val windDirectionAvg: Any? = null,

	@field:SerializedName("temperatureAvg")
	val temperatureAvg: Any? = null,

	@field:SerializedName("uvHealthConcernMax")
	val uvHealthConcernMax: Any? = null,

	@field:SerializedName("temperatureMin")
	val temperatureMin: Any? = null,

	@field:SerializedName("snowAccumulationMax")
	val snowAccumulationMax: Any? = null,

	@field:SerializedName("dewPointMax")
	val dewPointMax: Any? = null,

	@field:SerializedName("humidityAvg")
	val humidityAvg: Any? = null,

	@field:SerializedName("humidityMin")
	val humidityMin: Any? = null,

	@field:SerializedName("snowAccumulationSum")
	val snowAccumulationSum: Any? = null,

	@field:SerializedName("windSpeedMax")
	val windSpeedMax: Any? = null,

	@field:SerializedName("windGustMax")
	val windGustMax: Any? = null,

	@field:SerializedName("snowAccumulationAvg")
	val snowAccumulationAvg: Any? = null,

	@field:SerializedName("snowAccumulationMin")
	val snowAccumulationMin: Any? = null,

	@field:SerializedName("freezingRainAnyensityMax")
	val freezingRainAnyensityMax: Any? = null,

	@field:SerializedName("temperatureMax")
	val temperatureMax: Any? = null,

	@field:SerializedName("snowAnyensityAvg")
	val snowAnyensityAvg: Any? = null,

	@field:SerializedName("snowAnyensityMin")
	val snowAnyensityMin: Any? = null,

	@field:SerializedName("temperatureApparentAvg")
	val temperatureApparentAvg: Any? = null,

	@field:SerializedName("temperatureApparentMin")
	val temperatureApparentMin: Any? = null,

	@field:SerializedName("uvIndexAvg")
	val uvIndexAvg: Any? = null,

	@field:SerializedName("uvIndexMin")
	val uvIndexMin: Any? = null,

	@field:SerializedName("windSpeedMin")
	val windSpeedMin: Any? = null,

	@field:SerializedName("windSpeedAvg")
	val windSpeedAvg: Any? = null,

	@field:SerializedName("rainAccumulationLweAvg")
	val rainAccumulationLweAvg: Any? = null,

	@field:SerializedName("rainAccumulationLweMin")
	val rainAccumulationLweMin: Any? = null,

	@field:SerializedName("rainAccumulationSum")
	val rainAccumulationSum: Any? = null,

	@field:SerializedName("rainAnyensityMin")
	val rainAnyensityMin: Any? = null,

	@field:SerializedName("sleetAccumulationLweSum")
	val sleetAccumulationLweSum: Any? = null,

	@field:SerializedName("sunsetTime")
	val sunsetTime: String? = null,

	@field:SerializedName("rainAnyensityAvg")
	val rainAnyensityAvg: Any? = null,

	@field:SerializedName("moonsetTime")
	val moonsetTime: String? = null,

	@field:SerializedName("pressureSurfaceLevelAvg")
	val pressureSurfaceLevelAvg: Any? = null,

	@field:SerializedName("pressureSurfaceLevelMin")
	val pressureSurfaceLevelMin: Any? = null,

	@field:SerializedName("temperatureApparentMax")
	val temperatureApparentMax: Any? = null,

	@field:SerializedName("uvIndexMax")
	val uvIndexMax: Any? = null,

	@field:SerializedName("evapotranspirationMax")
	val evapotranspirationMax: Any? = null,

	@field:SerializedName("sleetAccumulationLweAvg")
	val sleetAccumulationLweAvg: Any? = null,

	@field:SerializedName("sleetAccumulationLweMin")
	val sleetAccumulationLweMin: Any? = null,

	@field:SerializedName("rainAccumulationAvg")
	val rainAccumulationAvg: Any? = null,

	@field:SerializedName("rainAccumulationMin")
	val rainAccumulationMin: Any? = null,

	@field:SerializedName("sleetAnyensityMax")
	val sleetAnyensityMax: Any? = null,

	@field:SerializedName("snowAnyensityMax")
	val snowAnyensityMax: Any? = null,

	@field:SerializedName("sunriseTime")
	val sunriseTime: String? = null,

	@field:SerializedName("iceAccumulationSum")
	val iceAccumulationSum: Any? = null,

	@field:SerializedName("evapotranspirationSum")
	val evapotranspirationSum: Any? = null,

	@field:SerializedName("rainAnyensityMax")
	val rainAnyensityMax: Any? = null,

	@field:SerializedName("precipitationProbabilityMax")
	val precipitationProbabilityMax: Any? = null,

	@field:SerializedName("visibilityMax")
	val visibilityMax: Any? = null,

	@field:SerializedName("rainAccumulationLweMax")
	val rainAccumulationLweMax: Any? = null,

	@field:SerializedName("sleetAnyensityAvg")
	val sleetAnyensityAvg: Any? = null,

	@field:SerializedName("sleetAnyensityMin")
	val sleetAnyensityMin: Any? = null,

	@field:SerializedName("evapotranspirationAvg")
	val evapotranspirationAvg: Any? = null,

	@field:SerializedName("evapotranspirationMin")
	val evapotranspirationMin: Any? = null,

	@field:SerializedName("cloudBaseAvg")
	val cloudBaseAvg: Any? = null,

	@field:SerializedName("cloudBaseMin")
	val cloudBaseMin: Any? = null,

	@field:SerializedName("iceAccumulationLweMax")
	val iceAccumulationLweMax: Any? = null,

	@field:SerializedName("rainAccumulationMax")
	val rainAccumulationMax: Any? = null,

	@field:SerializedName("sleetAccumulationLweMax")
	val sleetAccumulationLweMax: Any? = null,

	@field:SerializedName("snowAccumulationLweSum")
	val snowAccumulationLweSum: Any? = null,

	@field:SerializedName("visibilityAvg")
	val visibilityAvg: Any? = null,

	@field:SerializedName("precipitationProbabilityAvg")
	val precipitationProbabilityAvg: Any? = null,

	@field:SerializedName("precipitationProbabilityMin")
	val precipitationProbabilityMin: Any? = null,

	@field:SerializedName("visibilityMin")
	val visibilityMin: Any? = null,

	@field:SerializedName("sleetAccumulationAvg")
	val sleetAccumulationAvg: Any? = null,

	@field:SerializedName("sleetAccumulationMin")
	val sleetAccumulationMin: Any? = null,

	@field:SerializedName("cloudCoverMax")
	val cloudCoverMax: Any? = null,

	@field:SerializedName("iceAccumulationLweSum")
	val iceAccumulationLweSum: Any? = null,

	@field:SerializedName("cloudBaseMax")
	val cloudBaseMax: Any? = null,

	@field:SerializedName("iceAccumulationLweAvg")
	val iceAccumulationLweAvg: Any? = null,

	@field:SerializedName("iceAccumulationLweMin")
	val iceAccumulationLweMin: Any? = null,

	@field:SerializedName("snowDepthMin")
	val snowDepthMin: Any? = null,

	@field:SerializedName("snowDepthSum")
	val snowDepthSum: Any? = null,

	@field:SerializedName("snowDepthMax")
	val snowDepthMax: Any? = null,

	@field:SerializedName("snowDepthAvg")
	val snowDepthAvg: Any? = null,

	@field:SerializedName("precipitationProbability")
	val precipitationProbability: Any? = null,

	@field:SerializedName("snowAnyensity")
	val snowAnyensity: Any? = null,

	@field:SerializedName("snowAccumulation")
	val snowAccumulation: Any? = null,

	@field:SerializedName("visibility")
	val visibility: Any? = null,

	@field:SerializedName("freezingRainAnyensity")
	val freezingRainAnyensity: Any? = null,

	@field:SerializedName("windGust")
	val windGust: Any? = null,

	@field:SerializedName("rainAnyensity")
	val rainAnyensity: Any? = null,

	@field:SerializedName("temperatureApparent")
	val temperatureApparent: Any? = null,

	@field:SerializedName("weatherCode")
	val weatherCode: Any? = null,

	@field:SerializedName("cloudCover")
	val cloudCover: Any? = null,

	@field:SerializedName("evapotranspiration")
	val evapotranspiration: Any? = null,

	@field:SerializedName("pressureSurfaceLevel")
	val pressureSurfaceLevel: Any? = null,

	@field:SerializedName("dewPoint")
	val dewPoint: Any? = null,

	@field:SerializedName("sleetAnyensity")
	val sleetAnyensity: Any? = null,

	@field:SerializedName("iceAccumulation")
	val iceAccumulation: Any? = null,

	@field:SerializedName("sleetAccumulation")
	val sleetAccumulation: Any? = null,

	@field:SerializedName("cloudBase")
	val cloudBase: Any? = null,

	@field:SerializedName("temperature")
	val temperature: Any? = null,

	@field:SerializedName("humidity")
	val humidity: Any? = null,

	@field:SerializedName("windDirection")
	val windDirection: Any? = null,

	@field:SerializedName("windSpeed")
	val windSpeed: Any? = null,

	@field:SerializedName("rainAccumulation")
	val rainAccumulation: Any? = null,

	@field:SerializedName("cloudCeiling")
	val cloudCeiling: Any? = null,

	@field:SerializedName("snowAccumulationLwe")
	val snowAccumulationLwe: Any? = null,

	@field:SerializedName("rainAccumulationLwe")
	val rainAccumulationLwe: Any? = null,

	@field:SerializedName("sleetAccumulationLwe")
	val sleetAccumulationLwe: Any? = null,

	@field:SerializedName("iceAccumulationLwe")
	val iceAccumulationLwe: Any? = null,

	@field:SerializedName("uvHealthConcern")
	val uvHealthConcern: Any? = null,

	@field:SerializedName("uvIndex")
	val uvIndex: Any? = null,

	@field:SerializedName("snowDepth")
	val snowDepth: Any? = null
)
