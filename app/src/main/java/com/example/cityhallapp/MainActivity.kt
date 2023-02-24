package com.example.cityhallapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)


        val groundFloorBtn = findViewById<ImageButton>(R.id.bt_ground)
        groundFloorBtn.setOnClickListener {
            val intent = Intent( this, ground_floor::class.java)
            startActivity(intent)
        }

        val baseFloorBtn = findViewById<ImageButton>(R.id.bt_basement)
        baseFloorBtn.setOnClickListener {
            val intent = Intent( this, basement_floor::class.java)
            startActivity(intent)
        }

        val secFloorBtn = findViewById<ImageButton>(R.id.bt_sec_floor)
        secFloorBtn.setOnClickListener {
            val intent = Intent( this, second_floor::class.java)
            startActivity(intent)
        }

        val thirdFloorBtn = findViewById<ImageButton>(R.id.bt_third_floor)
        thirdFloorBtn.setOnClickListener {
            val intent = Intent( this, third_floor::class.java)
            startActivity(intent)
        }

        val fourthFloorBtn = findViewById<ImageButton>(R.id.bt_fourth_floor)
        fourthFloorBtn.setOnClickListener {
            val intent = Intent( this, fourth_floor::class.java)
            startActivity(intent)
        }

    }
}