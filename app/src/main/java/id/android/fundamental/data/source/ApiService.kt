package id.android.fundamental.data.source

import id.android.fundamental.data.source.response.ForecastResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    companion object{
        const val API_KEY = "Z4cK4E0WyneME4rDoT4AnZgFqGi3cCj8"
    }

    @GET("forecast")
    fun fetchWeatherForecast(
        @Query("location") location: String,
        @Query("apikey") apiKey : String = API_KEY,
    ): Call<ForecastResponse>

    @GET("realtime")
    fun fetchWeatherRealtime(


    ): Call<ForecastResponse>

}