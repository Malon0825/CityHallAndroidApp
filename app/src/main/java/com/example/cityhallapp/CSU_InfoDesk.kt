package com.example.cityhallapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CSU_InfoDesk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_csu_info_desk)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
    }
}