package com.example.textstyling

import android.graphics.Color
import android.graphics.Typeface.BOLD
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.*
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forgroundSpan="Forground Span example with TextView" //10
        val backgroundSpan = "Background Span example with TextView"//11
        val unerlinetext = "UnderLine text Example with TextView"//9
        val resizingText = "I am Bigger, from Another String"//11
        val bulletExample = "Fruits:\nApple\nBanana"// Apple 5  Banana 6  fruits-8,
        val styledSpan = "I am Style example" //10

        val forgroundSpannableString = SpannableString(forgroundSpan)
        forgroundSpannableString.setSpan(ForegroundColorSpan(Color.YELLOW),0,10,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_forgroundcolor.text=forgroundSpannableString

        val backgroundColorSpan = SpannableString(backgroundSpan)
        backgroundColorSpan.setSpan(BackgroundColorSpan(Color.YELLOW),0,11,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_backgroundcolor.text=backgroundColorSpan
        val underlineSpannableString = SpannableString(unerlinetext)
        underlineSpannableString.setSpan(UnderlineSpan(),0,10,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_underline.text=underlineSpannableString
        val resizeSpannableString = SpannableString(resizingText)
        resizeSpannableString.setSpan(RelativeSizeSpan(4f),0,11,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_sizespan.text=resizeSpannableString
        val styledSpannableString = SpannableString(styledSpan)
        styledSpannableString .setSpan(StyleSpan(BOLD),0,11,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_stylespan.text=styledSpannableString
        val bulletSpannableString = SpannableString(bulletExample)
        bulletSpannableString.setSpan(BulletSpan(2,Color.MAGENTA,10),8,13,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        bulletSpannableString.setSpan(BulletSpan(2,Color.MAGENTA,10),14,bulletExample.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_bulletspan.text=bulletSpannableString




    }
}