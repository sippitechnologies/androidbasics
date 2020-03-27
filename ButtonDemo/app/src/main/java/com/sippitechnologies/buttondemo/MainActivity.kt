package com.sippitechnologies.buttondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(),View.OnClickListener  {

    lateinit var  button1:Button
    lateinit var button2:Button
    lateinit var  imageView:ImageView
    lateinit var button3:Button
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button2)
        button2 = findViewById(R.id.button3)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)
        button3 = findViewById(R.id.button4)
        button1.setOnClickListener(this)
        imageView.setOnClickListener{
            imageView.setImageResource(R.drawable.rose)
        }
        button2.setOnClickListener{
            button2.setBackgroundColor(resources.getColor(R.color.bg_green))
        }
        button3.setOnClickListener(onClick)
    }

    val  onClick = View.OnClickListener{
        Toast.makeText(MainActivity@this,"I am Button 3 Clicked",Toast.LENGTH_LONG).show()

    }
   public fun xmlClick(view: View)
    {
        Toast.makeText(MainActivity@this,"I am Button 3 Clicked",Toast.LENGTH_LONG).show()
        button.text = resources.getString(R.string.xmlbutton)

    }

    override fun onClick(v: View?) {
        ( v as Button).text = resources.getString(R.string.ichangeafteronclick)
    }

}
