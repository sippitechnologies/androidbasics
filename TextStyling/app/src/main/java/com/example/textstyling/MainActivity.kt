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
        val forgroundSpan="Forground Span example with TextView"
        val backgroundSpan = "Background Span example with TextView"
        val unerlinetext = "UnderLine text Example with TextView"
        val resizingText = "I am Bigger, from Another String"
        val bulletExample = "Fruits:\nApple\nBanana"
        val styledSpan = "I am Style example"

        val foregroundSpannable= SpannableString(forgroundSpan)
        foregroundSpannable.setSpan(ForegroundColorSpan(Color.BLUE),0,15,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_forgroundcolor.text=foregroundSpannable
        val backgroundColorSpan= SpannableString(backgroundSpan)
        backgroundColorSpan.setSpan(BackgroundColorSpan(Color.RED),0,15,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_backgroundcolor.text = backgroundColorSpan

        val underlineSpanableString = SpannableString(unerlinetext)
        underlineSpanableString.setSpan(UnderlineSpan(),0,10,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_underline.text=underlineSpanableString

        val resizeSpannableString = SpannableString(resizingText)
        resizeSpannableString.setSpan(RelativeSizeSpan(3f),0,12,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_sizespan.text=resizeSpannableString
        val bulletSpannableString = SpannableString(bulletExample)
        bulletSpannableString.setSpan(BulletSpan(10, Color.MAGENTA,20),8,14,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        bulletSpannableString.setSpan(BulletSpan(10, Color.MAGENTA,20),14,bulletExample.length,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_bulletspan.text = bulletSpannableString

        val styleSpannedString = SpannableString(styledSpan)
        styleSpannedString.setSpan(StyleSpan(BOLD),0,10,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_stylespan.text=styleSpannedString




    }
}