package com.sippitechnologies.imageswitcherdemo


import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val images= arrayOf(R.drawable.dotnet,R.drawable.c,R.drawable.pascal,R.drawable.nodejs)
    var counter =0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setForSwitching()
        button_next.setOnClickListener {
            counter++
            if(counter==images.size)
            {
                counter=0
            }
            val imageforChange = images[counter]
            imageswitcher_languages.setImageResource(imageforChange)
        }
    }

    fun setForSwitching()
    {
        setFactory()
        setAnimations()
    }
    fun setFactory()
    {
        imageswitcher_languages.setFactory(ViewSwitcher.ViewFactory {
            getImageView()

        })

    }
    fun getImageView():ImageView
    {
        val imageView = ImageView(this)
        imageView.layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT)
        imageView.scaleType=ImageView.ScaleType.FIT_XY
        imageView.setImageResource(R.drawable.dotnet)
        return  imageView
    }
    fun setAnimations()
    {
            val animOut = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right)
            val animIn = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left)

        val animOut1 = AnimationUtils.loadAnimation(this,android.R.anim.fade_out)
        val animIn1 = AnimationUtils.loadAnimation(this,android.R.anim.fade_in)
        imageswitcher_languages.outAnimation=animOut
        imageswitcher_languages.inAnimation=animIn
        /*imageswitcher_languages.outAnimation=animOut1
        imageswitcher_languages.inAnimation=animIn1*/
    }

}