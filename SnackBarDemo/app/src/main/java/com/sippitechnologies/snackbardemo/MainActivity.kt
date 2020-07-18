package com.sippitechnologies.snackbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showsnackbar.setOnClickListener {
            val snackbar= Snackbar.make(container, "Hello World", Snackbar.LENGTH_SHORT)
            snackbar.setAction(R.string.app_name, View.OnClickListener {
                Log.d("You are Clicked","Action Clicked")
            })
            snackbar.show()
        }

    }
}