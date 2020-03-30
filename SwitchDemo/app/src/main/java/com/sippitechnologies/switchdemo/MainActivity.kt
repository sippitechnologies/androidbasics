package com.sippitechnologies.switchdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
            {
                switch2.text = resources.getString(R.string.lightison)
                imageView2.setImageResource(R.drawable.bulbon)
            }
            else
            {
                switch2.text = resources.getString(R.string.lightisoff)
                imageView2.setImageResource(R.drawable.bulboff)
            }
        }
    }
}
