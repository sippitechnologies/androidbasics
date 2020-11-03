package com.example.showhidepassword
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isHideen = true
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            imageView.setOnClickListener {
                isHideen = !isHideen
                if(isHideen)
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