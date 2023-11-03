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

class MainViewModel: ViewModel() {

    // TODO:

    companion object {
        const val TAG = "MainViewModel"
    }

}