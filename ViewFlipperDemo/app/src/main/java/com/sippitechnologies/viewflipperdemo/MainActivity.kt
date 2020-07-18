package com.sippitechnologies.viewflipperdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = ImageView(this)
        imageView.setImageResource(R.drawable.coinimage_head)
        imageView.scaleType=ImageView.ScaleType.FIT_XY
        val imageView2 = ImageView(this)
        imageView2.setImageResource(R.drawable.coin_tail)
        imageView2.scaleType=ImageView.ScaleType.FIT_XY

        viewflipper.addView(imageView,LinearLayout.LayoutParams(400,400))
        viewflipper.addView(imageView2,LinearLayout.LayoutParams(400,400))
        viewflipper.flipInterval=5000
        viewflipper.setInAnimation(this,android.R.anim.slide_in_left)
        viewflipper.setOutAnimation(this,android.R.anim.slide_out_right)
        viewflipper.startFlipping()
    }
}