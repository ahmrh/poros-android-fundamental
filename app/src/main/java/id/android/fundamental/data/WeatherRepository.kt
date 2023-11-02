package id.android.fundamental.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.android.fundamental.data.model.Weather
import id.android.fundamental.data.source.ApiConfig
import id.android.fundamental.data.source.response.DailyItem
import id.android.fundamental.data.source.response.ForecastResponse
import id.android.fundamental.utils.DateUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherRepository {
    companion object {
        const val TAG = "WeatherRepository"
    }

    fun fetchWeather(): LiveData<Weather> {
        val result = MutableLiveData<Weather>()

        val client = ApiConfig.provideApiService()
            .fetchWeatherForecast(
                location = "jakarta"
            )
        client.enqueue(object :
            Callback<ForecastResponse> {
            override fun onResponse(
                call: Call<ForecastResponse>,
                response: Response<ForecastResponse>
            ) {
                if (response.isSuccessful) {
                    result.value =
                        response.body()?.let {
                            mapWeatherFromApiResponse(it)
                        }
                } else {
                    Log.e(
                        TAG,
                        "onFailureResponse: ${response.message()}"
                    )
                }
            }

            override fun onFailure(
                call: Call<ForecastResponse>,
                t: Throwable
            ) {
                Log.e(
                    TAG,
                    "onFailureThrowable: ${t.message}"
                )
            }

        })

        return result
    }


    private fun mapWeatherFromApiResponse(
        response: ForecastResponse
    ): Weather {
        val nextForecasts = response.timelines!!.daily!!.toMutableList()
        val todayForecast = nextForecasts.removeFirst()!!


        val forecasts: MutableList<Weather> = mutableListOf()

        nextForecasts.forEach { forecast ->
            forecasts.add(
                getWeatherFromForecast(
                    forecast!!
                )
            )
        }

        return getWeatherFromForecast(
            todayForecast
        )
    }

    private fun getWeatherFromForecast(
        forecast: DailyItem
    ): Weather {
        val forecastValues = forecast.values!!
        val forecastTime = forecast.time!!

        return Weather(
            day = DateUtils.getDayFromDateString(forecastTime),
            temperature = forecastValues?.temperatureAvg as Double,
            sunriseTime = forecastValues.sunriseTime,
            sunsetTime = forecastValues.sunsetTime,
            windSpeed = forecastValues.windSpeedAvg as Double,
            windDirection = forecastValues.windDirectionAvg as Int,
            pressure = forecastValues.pressureSurfaceLevelAvg as Double,
            humidity = forecastValues.humidityAvg as Double,
            visibility = forecastValues.visibilityAvg,
            uvi = forecastValues.uvIndex,
            cloudCover = forecastValues.cloudCoverAvg as Double
        )
    }


}