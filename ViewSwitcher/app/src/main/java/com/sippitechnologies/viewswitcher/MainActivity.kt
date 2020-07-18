package com.sippitechnologies.viewswitcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var count=0
        setContentView(R.layout.activity_main)
        val layoutParams= FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT)
        val imageView=ImageView(this);
        imageView.setImageResource(R.drawable.ic_launcher_background)
        imageView.layoutParams =layoutParams
        val textView = TextView(this);
        textView.text="Good Morning"
        textView.layoutParams = layoutParams
        viewsitcher.addView(imageView,0)
        viewsitcher.addView(textView,1)
        button.setOnClickListener {

            viewsitcher.showNext()

        }
    }
}