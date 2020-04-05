package com.sippitechnologies.spinnerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countries = arrayOf<String>("India","USA","UK","Shri Lanka","Austriala","Pakistan","Bhutan")// Step 1 Take  data which you want to display in Spinner
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,android.R.id.text1,countries)
        //intialize adapter for Spinner
        spinner_country.adapter=arrayAdapter // attach adapter with spinner
        spinner_country.onItemSelectedListener = object:OnItemSelectedListener{ // we are attahing listener with spinner so that we dosomething on Spinner Item Selection

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                textview_country.text=countries[position] // If we selection something from spinner we write our code here to perform action
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


    }
}
