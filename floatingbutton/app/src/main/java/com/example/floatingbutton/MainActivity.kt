package com.example.floatingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        label.setOnClickListener {
            if(floatingActionButton4.isVisible)
            {
                floatingActionButton4.hide()
            }
            else
            {
                floatingActionButton4.show()
            }

        }
        floatingActionButton4.setOnClickListener {
            floatingActionButton4.clearCustomSize()

        }


    }
}