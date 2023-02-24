package com.example.cityhallapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class CityAccesorOffice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_city_accesor_office)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        val officeDirection = findViewById<ImageButton>(R.id.getDirection)
        officeDirection.setOnClickListener {
            val intent = Intent( this, CityAccesorDirection::class.java)
            startActivity(intent)
        }

    }
}