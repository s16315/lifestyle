package com.example.lifestyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton

class ActivityQuiz : AppCompatActivity() {
    var counter :Int = 1
    var points : Int = 0
    var keys: IntArray = intArrayOf(0, 0, 0, 0)


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
        this.points = this.points + this.keys[0] + this.keys[1] + this.keys[2] + this.keys[3]
        when (this.counter){
            2 -> {
                quiz = resources.getStringArray(R.array.quiz_2)
                this.keys = intArrayOf(0, 0, 1, 0)
            }
            3 -> {
                quiz = resources.getStringArray(R.array.quiz_3)
                this.keys = intArrayOf(0, 1, 0, 0)
            }
            4 -> {
                quiz = resources.getStringArray(R.array.quiz_4)
                this.keys = intArrayOf(1, 0, 0, 1)
            }
            5 -> {
                quiz = resources.getStringArray(R.array.quiz_5)
                this.keys = intArrayOf(1, 0, 0, 0)
            }
            6 -> {
                quiz = resources.getStringArray(R.array.quiz_6)
                this.keys = intArrayOf(0, 0, 1, 1)
            }
            else -> {
                quiz = resources.getStringArray(R.array.quiz_1)
                this.keys = intArrayOf(0, 0, 1, 0)
            }
        }
        if (this.counter < 7){
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
            findViewById<Button>(R.id.quizSubmit).visibility = View.INVISIBLE
            findViewById<ToggleButton>(R.id.quizAnswer1).visibility = View.INVISIBLE
            findViewById<ToggleButton>(R.id.quizAnswer2).visibility = View.INVISIBLE
            findViewById<ToggleButton>(R.id.quizAnswer3).visibility = View.INVISIBLE
            findViewById<ToggleButton>(R.id.quizAnswer4).visibility = View.INVISIBLE
            findViewById<TextView>(R.id.quizQuestion).visibility = View.INVISIBLE
            val resultTextView = findViewById<TextView>(R.id.quizResult)
            resultTextView.text = getString(R.string.quiz_result)
            resultTextView.append(this.points.toString())
            resultTextView.visibility = View.VISIBLE

        }

    }
}