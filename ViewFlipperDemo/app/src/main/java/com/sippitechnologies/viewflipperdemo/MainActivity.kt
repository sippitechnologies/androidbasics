package com.sippitechnologies.viewflipperdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val slides = arrayOf(Slide("C",R.drawable.c,"C is Great Lanaguage"),
            Slide("Dot Net",R.drawable.dotnet,"Dot Net is Great Framework"),
            Slide("Pascal",R.drawable.pascal,"Pascal is Great Lanaguage"),
            Slide("Node Js",R.drawable.nodejs,"Node Js is Rock"),
            Slide("Coin Tail",R.drawable.coin_tail,"Indian Coin Back Side")
        ,Slide("Coin Head",R.drawable.coinimage_head,"Indian Coin Front Side"),
                    Slide("Coin Image",R.drawable.coinimage,"Indian Coin both sides"))

        slides.mapIndexed { index, slide ->
            slider_root.addView(getSlideViewBySlideData(slide),index)
        }
       /* val inAmin =AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left)
        val outAnim =AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right)*/
        val inAmin =AnimationUtils.loadAnimation(this,android.R.anim.fade_in)
        val outAnim =AnimationUtils.loadAnimation(this,android.R.anim.fade_out)
        slider_root.inAnimation =inAmin
        slider_root.outAnimation =outAnim
        slider_root.flipInterval=2000
        slider_root.startFlipping()



    }

    fun getSlideViewBySlideData(slide:Slide):View
    {
        val view= LayoutInflater.from(this).inflate(R.layout.item_slide,null)
        val title = view.findViewById<TextView>(R.id.textView_title)
        val description = view.findViewById<TextView>(R.id.textView_description)
        val logo = view.findViewById<ImageView>(R.id.image_logo)

        title.text = slide.title
        description.text = slide.description
        logo.setImageResource(slide.logo)
        return view

    }

}