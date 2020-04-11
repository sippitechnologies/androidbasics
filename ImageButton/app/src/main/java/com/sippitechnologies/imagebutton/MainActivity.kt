package com.sippitechnologies.imagebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButton.setOnClickListener{
            imageButton2.visibility = View.GONE

        }
        imageButton2.setOnClickListener{
            imageButton.visibility = View.GONE
        }
        button2.setOnClickListener{
            imageButton.visibility = View.VISIBLE
            imageButton2.visibility = View.VISIBLE
        }

    }
}
