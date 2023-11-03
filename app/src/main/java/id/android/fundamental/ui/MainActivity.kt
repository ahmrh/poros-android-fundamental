package id.android.fundamental.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import id.android.fundamental.R
import id.android.fundamental.data.model.Weather
import id.android.fundamental.data.source.network.ApiResponse
import id.android.fundamental.databinding.ActivityMainBinding
import id.android.fundamental.utils.DateUtils
import id.android.fundamental.utils.WeatherUtils

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel //introducing viewmodel

    private lateinit var forecastTextViews: List<TextView>
    private lateinit var forecastImages: List<ImageView>
    private lateinit var forecastTemperatures: List<TextView>

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        setContentView(binding.root)

        initUi()
    }

    fun initUi(){
        forecastTextViews = listOf(
            binding.tvForecastDay1, binding.tvForecastDay2, binding.tvForecastDay3,
            binding.tvForecastDay4, binding.tvForecastDay5
        )

        forecastImages = listOf(
            binding.imgForecast1, binding.imgForecast2, binding.imgForecast3,
            binding.imgForecast4, binding.imgForecast5
        )

        forecastTemperatures = listOf(
            binding.tvForecastTemp1, binding.tvForecastTemp2, binding.tvForecastTemp3,
            binding.tvForecastTemp4, binding.tvForecastTemp5
        )


        viewModel.weatherLiveData.observe(this){
            when(it){
                is ApiResponse.Success -> {
                    showLoading(false)
                    Log.d("MainActivity", it.data.toString())
                    if(it.data != null) bindWeatherUI(it.data)
                }
                is ApiResponse.Empty -> showLoading(true)
                else -> showLoading(true)
            }

        }
    }

    private fun bindWeatherUI(weather: Weather){
        binding.tvCurrTemp.text = "${weather.temperature?.toInt()}°"
        binding.tvCurrWeather.text = "${WeatherUtils.classifyWeather(weather)}"


        for(i in 0 until 5){
            val forecast = weather.forecasts?.get(i)!!

            forecastTextViews[i].text = forecast.day
            forecastImages[i].setImageResource(getWeatherImageId(forecast))
            forecastTemperatures[i].text = "${forecast.temperature}°"
        }

        binding.tvSunrise.text = DateUtils.getTimeFromDateString(weather.sunriseTime!!)
        binding.tvSunset.text = DateUtils.getTimeFromDateString(weather.sunsetTime!!)
        binding.tvWindSpeed.text = "${weather.windSpeed} m/s"
        binding.tvWindDirection.text = "${weather.windDirection}°"

        binding.tvRealTemperature.text = "${weather.temperature}°"
        binding.tvPressure.text = "${weather.pressure} hPa"
        binding.tvHumidity.text = "${weather.humidity}%"
        binding.tvVisibility.text = "${weather.visibility} km"
        binding.tvDew.text = "${weather.dew}"

    }

    private fun getWeatherImageId(weather: Weather): Int{

        return when(WeatherUtils.classifyWeather(weather)){
            WeatherUtils.CLOUDY -> R.drawable.ic_weather_cloudy
            WeatherUtils.RAINY -> R.drawable.ic_weather_rainy
            WeatherUtils.SUNNY -> R.drawable.ic_weather_sunny
            else -> R.drawable.ic_launcher_background
        }
    }

    private fun showLoading(isLoading: Boolean){
        if(isLoading){
            binding.layoutLoading.visibility = View.VISIBLE
            binding.layoutWeather.visibility = View.GONE
        } else {
            binding.layoutLoading.visibility = View.GONE
            binding.layoutWeather.visibility = View.VISIBLE
        }
    }

}