package com.sippitechnologies.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.about->Toast.makeText(this@MainActivity,"About Selected",Toast.LENGTH_LONG).show()
                else-> Toast.makeText(this@MainActivity,"Profile  Selected",Toast.LENGTH_LONG).show()
            }
            true
        }
    }



}