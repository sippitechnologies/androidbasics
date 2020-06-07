package com.sippitechnologies.sharedpreferencedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  lateinit  var appPreferenceManager:AppPreferenceManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appPreferenceManager= AppPreferenceManager(this)
        button.setOnClickListener {
            appPreferenceManager.logout()
            startActivity(Intent(this,SplashActivity::class.java))
        }


    }

}