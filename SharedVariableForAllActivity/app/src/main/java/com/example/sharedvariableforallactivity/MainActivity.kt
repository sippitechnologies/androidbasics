package com.example.sharedvariableforallactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedvariableforallactivity.QuizData.score
import com.example.sharedvariableforallactivity.QuizData.updateScore
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateScore(textView)
        button.setOnClickListener {
            score++
            updateScore(textView)
        }
        button2.setOnClickListener {
            if(score>0)
            {
                score--
                updateScore(textView)
            }
        }
        button3.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }


    }

}