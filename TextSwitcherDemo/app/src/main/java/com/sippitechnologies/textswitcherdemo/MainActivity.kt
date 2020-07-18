package com.sippitechnologies.textswitcherdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ViewSwitcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val names = arrayOf("Kuldeep","Sandeep","Pardeep")
        var count=0;
        setContentView(R.layout.activity_main)
        textSwitcher.setFactory(ViewSwitcher.ViewFactory {
            val textView = TextView(this@MainActivity)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT)
            textView.layoutParams=layoutParams
            textView.text = names[0];

            textView
        })

        textView.setOnClickListener {
            count++;
            if(count==names.size)
            {
                count=0;
            }
            textSwitcher.setCurrentText(names[count])
        }

    }
}