package com.example.lifestyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton

class ActivityQuiz : AppCompatActivity() {
    val counter :Int = 0
    //val answers : Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val quizQuestionTextView = findViewById<TextView>(R.id.quizQuestion) as TextView
        val quizAnswer1Button = findViewById<ToggleButton>(R.id.quizAnswer1) as ToggleButton
        val quizAnswer2Button = findViewById<ToggleButton>(R.id.quizAnswer2) as ToggleButton
        val quizAnswer3Button = findViewById<ToggleButton>(R.id.quizAnswer3) as ToggleButton
        val quizAnswer4Button = findViewById<ToggleButton>(R.id.quizAnswer4) as ToggleButton
        val quizSubmitButton = findViewById<Button>(R.id.quizSubmit)


        val quiz_1: Array<String> = resources.getStringArray(R.array.quiz_1)

        quizQuestionTextView.text = quiz_1[0]
        quizAnswer1Button.textOff = quiz_1[1]
        quizAnswer1Button.textOn = quiz_1[1]
        quizAnswer1Button.isChecked = false
        quizAnswer2Button.textOff = quiz_1[2]
        quizAnswer2Button.textOn = quiz_1[2]
        quizAnswer2Button.isChecked = false
        quizAnswer3Button.textOff = quiz_1[3]
        quizAnswer3Button.textOn = quiz_1[3]
        quizAnswer3Button.isChecked = false
        quizAnswer4Button.textOff = quiz_1[4]
        quizAnswer4Button.textOn = quiz_1[4]
        quizAnswer4Button.isChecked = false

        quizSubmitButton.text =  getString(R.string.quiz_button_Submit)

    }
}