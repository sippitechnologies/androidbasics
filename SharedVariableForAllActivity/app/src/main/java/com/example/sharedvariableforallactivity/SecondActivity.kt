package com.example.sharedvariableforallactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedvariableforallactivity.QuizData.updateScore
import kotlinx.android.synthetic.main.activity_main.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateScore(textView)

        updateScore(textView)
        button.setOnClickListener {
            QuizData.score++
            updateScore(textView)
        }
        button2.setOnClickListener {
            if(QuizData.score >0)
            {
                QuizData.score--
                updateScore(textView)
            }
        }
        button3.setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))
        }
    }

}