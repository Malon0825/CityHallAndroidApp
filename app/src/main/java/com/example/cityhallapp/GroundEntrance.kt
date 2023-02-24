package com.example.cityhallapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GroundEntrance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ground_entrance)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
    }
}