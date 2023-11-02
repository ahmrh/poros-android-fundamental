package id.android.fundamental.ui

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import id.android.fundamental.R
import id.android.fundamental.data.model.Weather
import id.android.fundamental.databinding.ActivityMainBinding
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
            binding.tvForecastDay4, binding.tvForecastDay5, binding.tvForecastDay6
        )

        forecastImages = listOf(
            binding.imgForecast1, binding.imgForecast2, binding.imgForecast3,
            binding.imgForecast4, binding.imgForecast5, binding.imgForecast6
        )

        forecastTemperatures = listOf(
            binding.tvForecastTemp1, binding.tvForecastTemp2, binding.tvForecastTemp3,
            binding.tvForecastTemp4, binding.tvForecastTemp5, binding.tvForecastTemp6
        )


        viewModel.weatherLiveData.observe(this){weather ->
            if(weather != null) bindWeatherUI(weather)
        }
        viewModel.isLoading.observe(this){isLoading ->
            showLoading(isLoading)
        }
        viewModel.getWeather()
    }

    private fun bindWeatherUI(weather: Weather){
        for(i in 0 until 6){
            val weather = weather.forecasts?.get(i)!!

            forecastTextViews[i].text = weather.day
            forecastImages[i].setImageResource(getWeatherImageId(weather))
            forecastTemperatures[i].text = "${weather.temperature}°"
        }

        binding.tvSunrise.text = weather.sunriseTime
        binding.tvSunset.text = weather.sunsetTime
        binding.tvWindSpeed.text = "${weather.windSpeed} m/s"
        binding.tvWindDirection.text = "${weather.windDirection}°"

        binding.tvRealTemperature.text = "${weather.temperature}°"
        binding.tvPressure.text = "${weather.pressure} hPa"
        binding.tvHumidity.text = "${weather.humidity}%"
        binding.tvVisibility.text = "${weather.visibility} km"
        binding.tvUvi.text = "${weather.uvi}"

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