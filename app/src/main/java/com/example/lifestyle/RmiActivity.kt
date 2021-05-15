package com.example.lifestyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RmiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rmi)

        val ingredientsTextView =  findViewById<TextView>(R.id.rmiTextViewIngredients) as TextView
        val stepsTextView =  findViewById<TextView>(R.id.rmiTextViewSteps) as TextView
        val ingredientsArray = resources.getStringArray(R.array.rec_ingredients)
        for (item in ingredientsArray) {
            ingredientsTextView.append(item)
            ingredientsTextView.append("\n")
        }
        val stepsArray = resources.getStringArray(R.array.rec_steps)
        for (item in stepsArray) {
            stepsTextView.append(item)
            stepsTextView.append("\n")
        }

    }


}