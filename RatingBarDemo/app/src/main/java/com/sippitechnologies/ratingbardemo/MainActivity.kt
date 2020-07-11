package com.sippitechnologies.ratingbardemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ratingforapp.setOnRatingBarChangeListener { ratingBar, fl, b ->
            textView_byuser.text= fl.toString()
        }


    }


}