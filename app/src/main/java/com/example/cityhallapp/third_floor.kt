package com.example.cityhallapp

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class third_floor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_floor)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        val floorSelect = findViewById<ImageButton>(R.id.drp_third)

        floorSelect.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.floor_selection_btn, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val viewBasement = dialogBinding.findViewById<ImageButton>(R.id.baseBtn)
            viewBasement.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, basement_floor::class.java)
                startActivity(intent)

            }

            val viewGround = dialogBinding.findViewById<ImageButton>(R.id.groundBtn)
            viewGround.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, ground_floor::class.java)
                startActivity(intent)

            }

            val viewSec = dialogBinding.findViewById<ImageButton>(R.id.sec_btn)
            viewSec.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, second_floor::class.java)
                startActivity(intent)

            }

            val viewThird = dialogBinding.findViewById<ImageButton>(R.id.third_btn)
            viewThird.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, third_floor::class.java)
                startActivity(intent)

            }

            val viewFourth = dialogBinding.findViewById<ImageButton>(R.id.fourth_btn)
            viewFourth.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, fourth_floor::class.java)
                startActivity(intent)

            }

            val viewHomepage = dialogBinding.findViewById<ImageButton>(R.id.homepage_btn)
            viewHomepage.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, MainActivity::class.java)
                startActivity(intent)

            }
        }

        val officeSelect = findViewById<ImageButton>(R.id.search_off_btn)

        officeSelect.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.third_floor_office, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            //Handle button function for each office

        }
    }
}