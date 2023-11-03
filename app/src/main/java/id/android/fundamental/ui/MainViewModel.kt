package id.android.fundamental.ui

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.android.fundamental.data.WeatherRepository
import id.android.fundamental.data.model.Weather
import id.android.fundamental.data.source.network.ApiResponse
import kotlinx.coroutines.launch

// Todo: Make ViewModel repository
class MainViewModel: ViewModel() {

    companion object {
        const val TAG = "MainViewModel"
    }

    private var weatherRepository: WeatherRepository =
        WeatherRepository()

    private val _weatherLiveData = weatherRepository.fetchWeather()
    var weatherLiveData: LiveData<ApiResponse<Weather>> = _weatherLiveData


}