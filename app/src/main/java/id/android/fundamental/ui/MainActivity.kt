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
    private lateinit var viewModel: MainViewModel

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        setContentView(binding.root)

        /* TODO : Initialize User Interface and ViewModel*/
    }

   companion object{
       const val TAG = "MainActivity";
   }

}