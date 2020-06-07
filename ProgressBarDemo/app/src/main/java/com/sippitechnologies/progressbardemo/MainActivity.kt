package com.sippitechnologies.progressbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            if(progressBar2.visibility== View.GONE)
            {
                progressBar2.visibility=View.VISIBLE
                button.text="Hide Progress Bar"
            }
            else
            {
                progressBar2.visibility=View.GONE
                button.text="Show Progress Bar"
            }
        }
        button2.setOnClickListener {
            val msg = "Max Value=${progressBar.max}\nProgress=${progressBar.progress}"
            textView.text=msg

        }
    }
}