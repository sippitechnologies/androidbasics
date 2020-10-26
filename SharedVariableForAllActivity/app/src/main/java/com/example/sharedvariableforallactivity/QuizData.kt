package com.example.sharedvariableforallactivity

import android.widget.TextView

object QuizData
{
    var score=0

    fun updateScore(textView: TextView)
    {
        textView.text= "${score}"
    }
}