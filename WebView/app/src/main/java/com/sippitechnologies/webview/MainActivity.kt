package com.sippitechnologies.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url="https://google.com"
        setClient(url)



    }



    fun setClient(url:String)
    {
        val client =  WebViewClient()
        webview.webViewClient=client
        webview.loadUrl(url)



    }

}