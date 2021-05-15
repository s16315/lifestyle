package com.example.lifestyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton
import kotlin.math.absoluteValue

class ActivityQuiz : AppCompatActivity() {
    var counter :Int = 1
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
        quizSubmitButton.setOnClickListener { nextQuestion() }
        nextQuestion()
        quizSubmitButton.text =  getString(R.string.quiz_button_Submit)
    }

    fun nextQuestion(){
        this.counter = this.counter + 1
        val quiz: Array<String>
        when (this.counter){
            2 ->  quiz = resources.getStringArray(R.array.quiz_2)
            3 ->  quiz = resources.getStringArray(R.array.quiz_3)
            4 ->  quiz = resources.getStringArray(R.array.quiz_4)
            5 ->  quiz = resources.getStringArray(R.array.quiz_5)
            6 ->  quiz = resources.getStringArray(R.array.quiz_6)
            else -> quiz = resources.getStringArray(R.array.quiz_1)
        }
        if (this.counter < 6){
            val quizQuestionTextView = findViewById<TextView>(R.id.quizQuestion) as TextView
            val quizAnswer1Button = findViewById<ToggleButton>(R.id.quizAnswer1) as ToggleButton
            val quizAnswer2Button = findViewById<ToggleButton>(R.id.quizAnswer2) as ToggleButton
            val quizAnswer3Button = findViewById<ToggleButton>(R.id.quizAnswer3) as ToggleButton
            val quizAnswer4Button = findViewById<ToggleButton>(R.id.quizAnswer4) as ToggleButton

            quizQuestionTextView.text = quiz[0]
            quizAnswer1Button.textOff = quiz[1]
            quizAnswer1Button.textOn = quiz[1]
            quizAnswer1Button.isChecked = false
            quizAnswer2Button.textOff = quiz[2]
            quizAnswer2Button.textOn = quiz[2]
            quizAnswer2Button.isChecked = false
            quizAnswer3Button.textOff = quiz[3]
            quizAnswer3Button.textOn = quiz[3]
            quizAnswer3Button.isChecked = false
            quizAnswer4Button.textOff = quiz[4]
            quizAnswer4Button.textOn = quiz[4]
            quizAnswer4Button.isChecked = false

        }
        else {
            findViewById<Button>(R.id.quizSubmit).text =  getString(R.string.quiz_result)
        }

    }
}