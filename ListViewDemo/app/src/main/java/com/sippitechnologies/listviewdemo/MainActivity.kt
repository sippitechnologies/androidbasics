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
        val fruitenames = arrayOf<String>("Apple","Banana","Cherry","Mango","Melon","Water Melon","Fig","Grapes","Guava","Plum","Pine Apple","Peach")// Its our data to display in our listView
        val fruitAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,fruitenames)
        //Above line we are initilize our default adapter so that our data will associate with View
        listview_fruit.adapter = fruitAdapter // set the with listview so that it will display on screen
        listview_fruit.setOnItemClickListener { parent, view, position, id -> 
            textView_fruitname.text = fruitenames[position] // Changing label as per listitem click
        }
        /*
        1. List is legacy widget means its available in android from its first version
        2. its comes with OnitemClickListener
        3. You can also use this fo multiply selections
        4. ArrayAdaper is default Adapter to fill string object and other in List
        5. You also use listview to display different kind of data in different view using Custom Adapter


         */
    }

}
