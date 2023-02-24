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

class second_floor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second_floor)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        val floorSelect = findViewById<ImageButton>(R.id.drp_sec)

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
            val dialogBinding = layoutInflater.inflate(R.layout.second_floor_office, null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val viewCivilReg = dialogBinding.findViewById<Button>(R.id.btn_CCRO)
            viewCivilReg.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityCivilOffice::class.java)
                startActivity(intent)

            }

            val viewEnvironment = dialogBinding.findViewById<Button>(R.id.btn_CENR)
            viewEnvironment.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityEnvironmentNaturalResources::class.java)
                startActivity(intent)

            }

            val viewAgriculture = dialogBinding.findViewById<Button>(R.id.btn_CAO)
            viewAgriculture.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityAgricultureOffice::class.java)
                startActivity(intent)

            }

            val viewArchitect = dialogBinding.findViewById<Button>(R.id.btn_CityArchiOff)
            viewArchitect.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityArchitectOffice::class.java)
                startActivity(intent)

            }

            val viewAffairs = dialogBinding.findViewById<Button>(R.id.btn_CCAO)
            viewAffairs.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityCommunityAffairsOffice::class.java)
                startActivity(intent)

            }

            val viewCCoopOff = dialogBinding.findViewById<Button>(R.id.btn_CCO)
            viewCCoopOff.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityCooperativesOffice::class.java)
                startActivity(intent)

            }

            val viewEngOffice = dialogBinding.findViewById<Button>(R.id.btn_CEO)
            viewEngOffice.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityEngineeringOffice::class.java)
                startActivity(intent)

            }

            val viewNutrition = dialogBinding.findViewById<Button>(R.id.btn_CNO)
            viewNutrition.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityNutritionOffice::class.java)
                startActivity(intent)

            }

            val viewWelfare = dialogBinding.findViewById<Button>(R.id.btn_CSWDO)
            viewWelfare.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CitySocialWelfareDevelopmentOffice::class.java)
                startActivity(intent)

            }

            val viewTourism = dialogBinding.findViewById<Button>(R.id.btn_CTCA)
            viewTourism.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityTourismCulturalAffairs::class.java)
                startActivity(intent)

            }

            val viewTourism2 = dialogBinding.findViewById<Button>(R.id.btn_CTCA2)
            viewTourism2.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityTourismCulturalAffairsTwo::class.java)
                startActivity(intent)

            }

            val viewVet = dialogBinding.findViewById<Button>(R.id.btn_CVO)
            viewVet.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CityCivilOffice::class.java)
                startActivity(intent)

            }

            val viewCRLeft = dialogBinding.findViewById<Button>(R.id.btn_CRL)
            viewCRLeft.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, SecondCRLeft::class.java)
                startActivity(intent)

            }


            val viewCRRight= dialogBinding.findViewById<Button>(R.id.btn_CRR)
            viewCRRight.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, SecondCRRight::class.java)
                startActivity(intent)

            }

            val viewOffCSWD = dialogBinding.findViewById<Button>(R.id.btn_OCSWDO)
            viewOffCSWD.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CSWDOffice::class.java)
                startActivity(intent)

            }

            val viewCounsellingCSWD = dialogBinding.findViewById<Button>(R.id.btn_CSWDOCR)
            viewCounsellingCSWD.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, CSWDCounsellingRoom::class.java)
                startActivity(intent)

            }

            val viewSecondElevator = dialogBinding.findViewById<Button>(R.id.btn_Elevator)
            viewSecondElevator.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent( this, Second_Elevator::class.java)
                startActivity(intent)

            }

        }
    }
}