package id.android.fundamental.ui

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.android.fundamental.data.WeatherRepository
import id.android.fundamental.data.model.Weather
import kotlinx.coroutines.launch

// Todo: Make ViewModel repository
class MainViewModel: ViewModel() {

    companion object {
        const val TAG = "MainViewModel"
    }

    private val _isLoading = MutableLiveData<Boolean>()
    var isLoading: LiveData<Boolean> = _isLoading

    private val _weatherLiveData = MutableLiveData<Weather>()
    var weatherLiveData: LiveData<Weather> = _weatherLiveData

    private var weatherRepository: WeatherRepository =
        WeatherRepository()

    fun getWeather(){
        _isLoading.value = true
        _weatherLiveData.value = weatherRepository.fetchWeather().value
        _isLoading.value = false
    }

}