package com.sippitechnologies.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calendarView.setOnDateChangeListener { calendarView, i, i2, i3 ->
            Toast.makeText(this@MainActivity,"Selected Date:$i3/$i2/$i",Toast.LENGTH_LONG).show()
        }

    }
}