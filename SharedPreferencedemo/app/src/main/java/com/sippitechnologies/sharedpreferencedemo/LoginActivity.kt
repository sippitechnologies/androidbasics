package com.sippitechnologies.sharedpreferencedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    lateinit var appPreferenceManager: AppPreferenceManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        appPreferenceManager= AppPreferenceManager(this)
        button2.setOnClickListener {
            loginHelper()
        }
    }

    private fun loginHelper() {
        if(TextUtils.isEmpty(editTextTextPersonName.text.toString()))
        {
            editTextTextPersonName.error = "Please Enter User Name"
            return
        }
        else  if(TextUtils.isEmpty(editTextTextPassword.text.toString()))
        {
            editTextTextPassword.error = "Please Enter password"
            return
        }
        else
        {
            appPreferenceManager.setLoggedInStatus(true)
            startActivity(Intent(this,MainActivity::class.java))
        }

    }

}