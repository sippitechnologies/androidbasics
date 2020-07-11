package com.sippitechnologies.animations

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fadeIn = AnimationUtils.loadAnimation(this,R.anim.fadein)
        text.animation = fadeIn
        text.animation.start()

    }
}