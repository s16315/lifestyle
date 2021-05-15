package com.example.lifestyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.ToggleButton

class ActivityHb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hb)
    }

    /**
     * Source:
     * https://www.calculator.net/bmr-calculator.html
     *
     * Revised Harris-Benedict Equation:
     * For men:
     * BMR = 13.397W + 4.799H - 5.677A + 88.362
     * For women:
     * BMR = 9.247W + 3.098H - 4.330A + 447.593
     */
    fun calculateBmr(view: View) {
        val intent = Intent(this, ActivityBmi::class.java)
        val rmiTextViewBmiScore = findViewById<TextView>(R.id.rmiTextViewBmiScore) as TextView
        val weightEditText = findViewById<TextView>(R.id.rmiEditTextNumberWeight) as EditText
        val weightString = weightEditText.text.toString()
        val heightEditText = findViewById<TextView>(R.id.rmiEditTextNumberHeight) as EditText
        val heightString = heightEditText.text.toString()
        val ageEditText = findViewById<TextView>(R.id.rmiEditTextNumberAge) as EditText
        val ageString = ageEditText.text.toString()
        val sexToggleButton = findViewById<ToggleButton>(R.id.bmrSexToggleButton) as ToggleButton
        val sex: Boolean = sexToggleButton.isChecked

        if(heightString.isNotBlank() && weightString.isNotBlank() && ageString.isNotBlank()){
            val weight = weightString.toDouble()
            val height = heightString.toDouble()
            val age = ageString.toDouble()
            val bmr: Double
            if(sex) {
                bmr = 13.397 * weight + 4.799 * height - 5.677 * age + 88.362
            }
            else {
                bmr = 9.247 * weight + 3.098 * height - 4.330 * age + 447.593
            }
            rmiTextViewBmiScore.text = Math.round(bmr).toString()

        }
    }
}