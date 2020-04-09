package com.sippitechnologies.toastdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button5.setOnClickListener {
            Toast.makeText(this,R.string.shortdurationtoast,Toast.LENGTH_SHORT).show()

        }
        button6.setOnClickListener {
            Toast.makeText(this,R.string.toastforlongduration,Toast.LENGTH_LONG).show()
        }
    }
}
