package com.sippitechnologies.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fruitsNames = arrayOf("Apple","Banana","Fig","Plum","Graps","Water Melon","Melon","Mango","Lichi")
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,fruitsNames)
        listview.adapter = arrayAdapter
        listview.setOnItemClickListener { parent, view, position, id ->
            text_lavel.text = fruitsNames[position]
        }
    }
}
