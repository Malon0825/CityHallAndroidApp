package com.example.cityhallapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CityTreasOffice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_treas_office)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
    }
}