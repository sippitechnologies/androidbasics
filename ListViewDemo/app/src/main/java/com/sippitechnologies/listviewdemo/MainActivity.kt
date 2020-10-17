package com.sippitechnologies.listviewdemo

import android.graphics.Color
import android.graphics.Typeface.BOLD
import android.graphics.fonts.FontStyle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.SpannedString
import android.text.style.*
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Its our data to display in our listView
        val fruitAdapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Data.fruitnames)
       listview_fruit.adapter = fruitAdapter

     /*   val headerView = TextView(this)
        headerView.text = "I am Header"

        val footerView = TextView(this)
        footerView.text= "Footer View"
        listview_fruit.addHeaderView(headerView)
        listview_fruit.addFooterView(footerView)
        listview_fruit.adapter = ProductAdapter(this,productsList)
        listview_fruit.setOnItemClickListener { parent, view, position, id ->
            textView_fruitname.text = fruitenames[position] // Changing label as per listitem click
        }*/

        /*
        1. List is legacy widget means its available in android from its first version
        2. its comes with OnitemClickListener
        3. You can also use this fo multiply selections
        4. ArrayAdaper is default Adapter to fill string object and other in List
        5. You also use listview to display different kind of data in different view using Custom Adapter


         */
    }

}
