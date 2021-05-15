package com.example.lifestyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Double.valueOf
import java.lang.Math.round

class ActivityBmi : AppCompatActivity() {
    val minHeight:Double = 0.4
    val maxHeight:Double = 2.5
    val minWeight:Double = 4.9
    val maxWeight:Double = 400.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

    }
/**
 * Calculate BMI based on an algorithm:
 *  BMI = height / weight^2
 **/

    fun calculateBmi(view: View) {
        val intent = Intent(this, ActivityBmi::class.java)
        val viewBmiScore = findViewById<TextView>(R.id.textViewBmiScore) as TextView
        val viewBmiCategory = findViewById<TextView>(R.id.textViewBmiCategory) as TextView
        val weightEditText = findViewById<TextView>(R.id.editTextNumberWeight) as EditText
        val weightString = weightEditText.text.toString()
        val heightEditText = findViewById<TextView>(R.id.editTextNumberHeight) as EditText
        val heightString = heightEditText.text.toString()
        if(heightString.isNotBlank() && weightString.isNotBlank()){
            val weight = weightString.toDouble()
            val height = heightString.toDouble()
            val bmi: Double = round((weight / ((height/100.0) * (height/100.0)))*100.0).toDouble()/100
            viewBmiScore.text = bmi.toString()
            if (bmi <= 18.49) viewBmiCategory.text = getString(R.string.bmi_1_category_name)
            else if (bmi <= 24.49) viewBmiCategory.text = getString(R.string.bmi_2_category_name)
            else if (bmi <= 29.49) viewBmiCategory.text = getString(R.string.bmi_3_category_name)
            else viewBmiCategory.text = getString(R.string.bmi_4_category_name)
        }
    }
}