package com.sippitechnologies.sharedpreferencedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable { navigationToHomeORLogin() },5000L)
    }

    private fun navigationToHomeORLogin() {
        val appPreferenceManager = AppPreferenceManager(this)
        val intent : Intent
        if(appPreferenceManager.isLoggedIn())
        {
            intent = Intent(this,MainActivity::class.java)
        }
        else
        {
            intent = Intent(this,LoginActivity::class.java)
        }
        startActivity(intent)
        finish()
    }

}