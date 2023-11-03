package id.android.fundamental.data.model


data class Weather(

    val day: String = "Day",
    val temperature: Double = 0.00,

    val forecasts: List<Weather> = emptyList(),

    val sunriseTime: String = "nn:nn",
    val sunsetTime: String = "nn:nn",

    val windSpeed: Double = 0.00,
    val windDirection: Double = 0.00,

    val pressure: Double = 0.00,
    val humidity: Double = 0.00,
    val visibility: Double = 0.00,
    val dew: Double = 0.00,

    val cloudCover: Double = 0.0
)