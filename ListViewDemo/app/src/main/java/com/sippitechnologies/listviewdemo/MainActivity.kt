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
    val productsList = mutableListOf<Product>(
        Product("Ring","This product is great and the price is best in market and Design is latest",200.00,R.drawable.ring),
        Product("Ear Ring","This product is great and the price is best in market and Design is latest",100.00,R.drawable.earring),
        Product("Pendant","This product is great and the price is best in market and Design is latest",200.00,R.drawable.pandent),
        Product("Ring","This product is great and the price is best in market and Design is latest",300.00,R.drawable.pended2),
        Product("Ear Ring","This product is great and the price is best in market and Design is latest",100.00,R.drawable.ring),
        Product("Pendant","This product is great and the price is best in market and Design is latest",400.00,R.drawable.earring),
        Product("Ring","This product is great and the price is best in market and Design is latest",100.00,R.drawable.pended2),
        Product("Ear Ring","This product is great and the price is best in market and Design is latest",50.00,R.drawable.pandent),
        Product("Pendant","This product is great and the price is best in market and Design is latest",200.00,R.drawable.ring),
        Product("Ring","This product is great and the price is best in market and Design is latest",200.00,R.drawable.earring),
        Product("Ear Ring","This product is great and the price is best in market and Design is latest",200.00,R.drawable.pended2),
        Product("Pendant","This product is great and the price is best in market and Design is latest",200.00,R.drawable.pandent),
        Product("Ring","This product is great and the price is best in market and Design is latest",200.00,R.drawable.earring),
        Product("Ear Ring","This product is great and the price is best in market and Design is latest",200.00,R.drawable.pandent),
        Product("Pendant","This product is great and the price is best in market and Design is latest",200.00,R.drawable.ring)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spannableString = SpannableString("Good Morning")
        spannableString.setSpan(ForegroundColorSpan(Color.BLUE),0,spannableString.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(UnderlineSpan(),0,spannableString.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(StyleSpan(BOLD),0,spannableString.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(RelativeSizeSpan(2f),0,spannableString.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(BulletSpan(10,Color.GREEN),0,spannableString.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan()


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
