package com.sippitechnologies.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener{
            Toast.makeText(this,R.string.fitxy,Toast.LENGTH_LONG).show()

        }
        imageView2.setOnClickListener{
            Toast.makeText(this,R.string.fitstart,Toast.LENGTH_LONG).show()
        }
        imageView3.setOnClickListener{
            Toast.makeText(this,R.string.fitend,Toast.LENGTH_LONG).show()
        }

    }
}
