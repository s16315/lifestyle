package com.example.lifestyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.main_button_bmi_launcher).setOnClickListener{
            val intent = Intent(this, ActivityBmi::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.main_button_HBR_launcher).setOnClickListener{
            val intent = Intent(this, ActivityHb::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.main_button_live_style).setOnClickListener{
            val intent = Intent(this, RmiActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.main_button_chart).setOnClickListener{
            val intent = Intent(this, ActivityChart::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.main_button_quiz).setOnClickListener{
            val intent = Intent(this, ActivityQuiz::class.java)
            startActivity(intent)
        }

    }
}