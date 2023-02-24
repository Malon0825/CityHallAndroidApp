package com.example.cityhallapp

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class ground_floor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
        setContentView(R.layout.activity_ground_floor)

        val floorSelect = findViewById<ImageButton>(R.id.drp_ground)

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
            val dialogBinding = layoutInflater.inflate(R.layout.ground_office, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val viewHomepage = dialogBinding.findViewById<Button>(R.id.btn_CAO)
            viewHomepage.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityAccesorOffice::class.java)
                startActivity(intent)

            }

            val viewHPopOffice = dialogBinding.findViewById<Button>(R.id.btn_CPO)
            viewHPopOffice.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityPopOffice::class.java)
                startActivity(intent)

            }

            val viewHTreaOffice = dialogBinding.findViewById<Button>(R.id.btn_CTO)
            viewHTreaOffice.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityTreasOffice::class.java)
                startActivity(intent)

            }

            val viewCRLeft = dialogBinding.findViewById<Button>(R.id.btn_CRL)
            viewCRLeft.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, Ground_CR_Left::class.java)
                startActivity(intent)

            }

            val viewCRRight = dialogBinding.findViewById<Button>(R.id.btn_CRR)
            viewCRRight.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, Ground_CR_Right::class.java)
                startActivity(intent)

            }

            val viewConsPermit = dialogBinding.findViewById<Button>(R.id.btn_CP)
            viewConsPermit.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, ConPermit::class.java)
                startActivity(intent)

            }

            val viewEcoEnter = dialogBinding.findViewById<Button>(R.id.btn_EE)
            viewEcoEnter.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, EcoEnterprise::class.java)
                startActivity(intent)

            }

            val viewEntrance = dialogBinding.findViewById<Button>(R.id.btn_FE)
            viewEntrance.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, GroundEntrance::class.java)
                startActivity(intent)

            }

            val viewExit = dialogBinding.findViewById<Button>(R.id.btn_FExit)
            viewExit.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, GroundExit::class.java)
                startActivity(intent)

            }

            val viewFranUnit = dialogBinding.findViewById<Button>(R.id.btn_FU)
            viewFranUnit.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, FranchiseUnit::class.java)
                startActivity(intent)

            }

            val viewGenSer = dialogBinding.findViewById<Button>(R.id.btn_GE)
            viewGenSer.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, GenService::class.java)
                startActivity(intent)

            }

            val viewElevator = dialogBinding.findViewById<Button>(R.id.btn_Elevator)
            viewElevator.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, Ground_Elevator::class.java)
                startActivity(intent)

            }

            val viewCSUDesk = dialogBinding.findViewById<Button>(R.id.btn_ID)
            viewCSUDesk.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CSU_InfoDesk::class.java)
                startActivity(intent)

            }


        }


    }
}