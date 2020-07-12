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

        supportFragmentManager.beginTransaction().add(R.id.root_cotainer,HomeFragment()).commit()
        bottomview.setOnNavigationItemSelectedListener {


      /* Part One Logic
       val msg =    when(it.itemId)
            {
                R.id.about->"About Selected"
                    else-> "Home Selected"
            }
            Toast.makeText(this@MainActivity,msg,Toast.LENGTH_LONG).show()*/

            val fragment =    when(it.itemId)
            {
                R.id.about->AboutFragment()
                else-> HomeFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.root_cotainer,fragment).commit()
            true
        }
    }

}