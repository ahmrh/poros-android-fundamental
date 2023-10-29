package id.android.fundamental.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.android.fundamental.R
import id.android.fundamental.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun initUi(){


    }
}