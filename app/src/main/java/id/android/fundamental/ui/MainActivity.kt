package id.android.fundamental.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import id.android.fundamental.data.model.Weather
import id.android.fundamental.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.StateFlow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        setContentView(binding.root)

        /* TODO 5: Bind data dari Observable di ViewModel */


    }

    suspend fun testingObservable(){

        val numObservable = MutableLiveData<Int>()
        numObservable.value = 0

        numObservable.observe(this){ num ->
            Log.d(TAG, "wah ada perubahan! $num")
        }

        delay(1000)

        numObservable.value = 100
    }

   companion object{
       const val TAG = "MainActivity";
   }

}