package com.sippitechnologies.buttonstyling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_roundcorner.setOnClickListener {
            button_with_state.isEnabled = !button_with_state.isEnabled
        }
    }
}