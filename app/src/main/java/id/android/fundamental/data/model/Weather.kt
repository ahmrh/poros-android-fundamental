package id.android.fundamental.data.model

import java.util.Date

data class Weather(
    val day: String? = "Day",
    val temperature: Double? = 0.00,

    val forecasts: List<Weather>? = emptyList(),

    val sunriseTime: String? = "nn:nn",
    val sunsetTime: String? = "nn:nn",

    val windSpeed: Double? = 0.00,
    val windDirection: Int? = 0,

    val pressure: Double? = 0.00,
    val humidity: Double? = 0.00,
    val visibility: Int? = 0,
    val uvi: Int? = 0,

    )