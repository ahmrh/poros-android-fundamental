package id.android.fundamental.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import id.android.fundamental.data.model.Weather
import id.android.fundamental.data.source.ApiConfig
import id.android.fundamental.data.source.response.ForecastResponse
import kotlinx.datetime.toLocalDate
import retrofit2.*
import java.time.format.TextStyle
import java.util.Locale

// Todo: Create Weather Repository Function
class WeatherRepository {
    companion object{
        const val TAG = "WeatherRepository"
    }

    fun fetchWeather(): LiveData<Weather> {
        val result = MutableLiveData<Weather>()

        val client = ApiConfig.provideApiService().fetchWeatherForecast(location = "jakarta")
        client.enqueue(object: Callback<ForecastResponse>{
            override fun onResponse(
                call: Call<ForecastResponse>,
                response: Response<ForecastResponse>
            ) {
                if(response.isSuccessful){
                    result.value =
                        response.body()?.let {
                            mapFromApiResponse(it)
                        }
                } else{
                    Log.e(TAG, "onFailureResponse: ${response.message()}")
                }
            }

            override fun onFailure(
                call: Call<ForecastResponse>,
                t: Throwable
            ) {
                Log.e(TAG, "onFailureThrowable: ${t.message}")
            }

        })

        return result
    }


    fun mapFromApiResponse(response: ForecastResponse): Weather{
        val todayForecast = response.timelines?.daily?.get(0)!!
        val forecast = response.timelines.daily

        val todayTime = todayForecast.time
        val todayWeather = todayForecast.values!!

        val date = todayTime?.toLocalDate()
//        val day = date?.dayOfWeek?.getDisplayName(TextStyle.FULL, Locale.ENGLISH)!!

        val forecasts: MutableList<Weather> = mutableListOf()

        forecast.forEach{
            forecasts.add(Weather())
        }

        return Weather(
//            day = day
            temperature = todayWeather.temperature as Double,
            sunriseTime = todayWeather.sunriseTime,
            sunsetTime = todayWeather.sunsetTime,
            windSpeed = todayWeather.windSpeed as Double,
            windDirection = todayWeather.windDirection as Int,
            pressure = todayWeather.pressureSurfaceLevel as Double,
            humidity = todayWeather.humidity as Double,
            visibility = todayWeather.visibility,
            uvi = todayWeather.uvIndex
        )
    }

}