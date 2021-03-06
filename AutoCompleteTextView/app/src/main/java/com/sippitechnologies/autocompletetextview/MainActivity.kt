package com.sippitechnologies.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val colorNames = arrayOf("Red","Green","Purple","Pink","Orange","Black","White","Brown","Aqua","Marron")
        val colorAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,android.R.id.text1,colorNames)
        autoCompleteTextView.setAdapter(colorAdapter)
        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->

            textView.text=autoCompleteTextView.text

        }
    }
}
