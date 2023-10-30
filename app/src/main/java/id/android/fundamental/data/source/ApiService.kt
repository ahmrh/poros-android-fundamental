package id.android.fundamental.data.source

import id.android.fundamental.data.source.response.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("forecast")
    fun fetchWeather(

    ): Call<WeatherResponse>

}