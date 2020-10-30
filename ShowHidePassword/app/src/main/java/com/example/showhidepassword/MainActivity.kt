package com.example.showhidepassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var hidden= true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener {
            hidden = !hidden
            if(hidden)
            {
                imageView.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                editTextTextPassword.transformationMethod = PasswordTransformationMethod.getInstance()

            }
            else
            {

                imageView.setImageResource(R.drawable.ic_baseline_visibility_24)
                editTextTextPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
            }
        }


    }
}