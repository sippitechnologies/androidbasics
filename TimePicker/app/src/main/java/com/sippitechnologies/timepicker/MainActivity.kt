package com.sippitechnologies.timepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        strattime.setOnTimeChangedListener { timePicker, i, i2 ->

            Toast.makeText(this@MainActivity,"$i:$i2",Toast.LENGTH_LONG).show()
        }

    }
}