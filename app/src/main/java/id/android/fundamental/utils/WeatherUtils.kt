package id.android.fundamental.utils

import id.android.fundamental.R
import id.android.fundamental.data.model.Weather

object WeatherUtils {
    const val SUNNY = "Sunny"
    const val CLOUDY = "Cloudy"
    const val RAINY = "Rainy"

    // Klasifikasi cuaca berdasarkan cloud cover dan humidity
    fun classifyWeather(weather: Weather): String{
        val cloudCover = weather.cloudCover!!
        val humidity = weather.humidity!!
        return when{
            cloudCover < 50 -> SUNNY
            else -> {
                when{
                    humidity < 60 -> CLOUDY
                    else -> RAINY
                }
            }
        }
    }

    fun getImageIdByWeatherString(weatherString: String): Int{
        return when(weatherString){
            SUNNY ->  R.drawable.ic_weather_sunny
            CLOUDY ->  R.drawable.ic_weather_cloudy
            RAINY ->  R.drawable.ic_weather_cloudy
            else -> return 0
        }
    }




}

