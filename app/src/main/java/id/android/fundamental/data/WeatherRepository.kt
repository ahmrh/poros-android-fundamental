package id.android.fundamental.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class WeatherRepository {
    // TODO 4: Buat fungsi untuk mengambil data dari API dengan fungsi yang ada di ApiService

    /**
     *  Example:
     *   fun getSomething(): LiveData<ApiResponse> {
     *         val result = MutableLiveData<ApiResponse>
     *
     *         val client = ApiConfig.provideApiService().fetchSomething(param = "parameter")
     *
     *         client.enqueue(object :
     *             Callback<ForecastResponse> {
     *             override fun onResponse( call: Call<Response>, response: Response<Response>) {
     *                 if (response.isSuccessful) {
     *
     *                 } else {
     *
     *                 }
     *             }
     *
     *             override fun onFailure(call: Call<Response>, t: Throwable) {
     *
     *             }
     *
     *         })
     *
     *         return result
     *   }
     *
     *
     */



    companion object {
        const val TAG = "WeatherRepository"
    }

}