package id.android.fundamental.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.android.fundamental.data.model.Weather
import id.android.fundamental.data.source.network.ApiConfig
import id.android.fundamental.data.source.network.ApiResponse
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

    fun fetchWeather(): LiveData<ApiResponse<Weather>> {
        val result = MutableLiveData<ApiResponse<Weather>>()

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
                    result.value = ApiResponse.Success(
                        mapWeatherFromApiResponse(
                            response.body()!!
                        )
                    )
                } else {
                    result.value = ApiResponse.Error(response.message())
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
                result.value = ApiResponse.Error(t.message ?: "Unidentified Error")
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

        Log.d(TAG, nextForecasts.toString())

        nextForecasts.forEach { forecast ->
            forecasts.add(
                getWeatherFromForecast(
                    forecast!!
                )
            )
        }

        return getWeatherFromForecast(
            todayForecast, forecasts
        )
    }

    private fun getWeatherFromForecast(
        forecast: DailyItem, nextForecasts: List<Weather> = emptyList()
    ): Weather {
        val forecastValues = forecast.values!!
        val forecastTime = forecast.time!!

        return Weather(
            day = DateUtils.getDayFromDateString(forecastTime),
            forecasts = nextForecasts,
            temperature = forecastValues?.temperatureAvg as Double,
            sunriseTime = forecastValues.sunriseTime,
            sunsetTime = forecastValues.sunsetTime,
            windSpeed = forecastValues.windSpeedAvg as Double,
            windDirection = forecastValues.windDirectionAvg as Double,
            pressure = forecastValues.pressureSurfaceLevelAvg as Double,
            humidity = forecastValues.humidityAvg as Double,
            visibility = forecastValues.visibilityAvg as Double,
            dew = forecastValues.dewPointAvg as Double,
            cloudCover = forecastValues.cloudCoverAvg as Double
        )
    }


}