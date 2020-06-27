package com.sippitechnologies.frameanimation

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val singnalAnimation = imageview.background as AnimationDrawable*/
        val signalAnimation  = getSignalAnimation()
        imageview.background=signalAnimation
        button_start.setOnClickListener{
            signalAnimation.start()
        }
        button_end.setOnClickListener{
            signalAnimation.stop()
        }

    }
    fun getSignalAnimation():AnimationDrawable
    {
        val frameOne = resources.getDrawable(R.drawable.wifi0) as BitmapDrawable
        val frameTwo = resources.getDrawable(R.drawable.wifi1) as BitmapDrawable
        val frameThee = resources.getDrawable(R.drawable.wifi2) as BitmapDrawable
        val frameFour = resources.getDrawable(R.drawable.wifi3) as BitmapDrawable

        val signalAnimation = AnimationDrawable()
        signalAnimation.addFrame(frameOne,200)
        signalAnimation.addFrame(frameTwo,200)
        signalAnimation.addFrame(frameThee,200)
        signalAnimation.addFrame(frameFour,200)

        return signalAnimation

    }
}