package com.example.sharedvariableforallactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sharedvariableforallactivity.QuizData.score
import kotlinx.android.synthetic.main.activity_main.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "Result:${score}"
    }
}