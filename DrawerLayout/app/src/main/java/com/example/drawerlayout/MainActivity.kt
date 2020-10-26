package com.example.drawerlayout

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportFragmentManager.beginTransaction().add(R.id.container_root, HomeFragment()).commit()
        setUpActionBarToogle()
        val header = navigationview_main.getHeaderView(0) as ConstraintLayout
        val profileImageView = header.findViewById<ImageView>(R.id.imageView_profile)
        val userEmail = header.findViewById<TextView>(R.id.textView_email);
        profileImageView.setImageResource(R.drawable.ic_baseline_person_24)
        userEmail.text = resources.getString(R.string.email)


    }

    fun setUpActionBarToogle() {
        actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            drawerlayout,
            toolbar,
            R.string.draewer_open,
            R.string.draewer_close
        )
        actionBarDrawerToggle.syncState()
        drawerlayout.addDrawerListener(actionBarDrawerToggle)
        navigationview_main.setNavigationItemSelectedListener(this)
    }


    fun changeFrament(selectedId: MenuItem) {
        var fragment =
            when (selectedId.itemId) {
                R.id.menu_contact -> ContactFragment()
                R.id.menu_about -> AboutFrament()
                else -> HomeFragment()
            }

        supportFragmentManager.beginTransaction().replace(R.id.container_root, fragment).commit()
        drawerlayout.closeDrawer(GravityCompat.START)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        changeFrament(item)
        return true
    }


}