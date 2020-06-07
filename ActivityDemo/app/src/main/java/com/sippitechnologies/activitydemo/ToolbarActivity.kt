package com.sippitechnologies.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toolbar.*

class ToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)
        setSupportActionBar(toolbar)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_third_menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val msg = when(item.itemId)
        {
            R.id.menuitem_add-> "Add is Clicked"
            R.id.menuitem_updte->"Update is Clicked"
            R.id.menuitem_delete->"Delete is Clicked"
            R.id.text1-> "Text One is Clicked"
            R.id.text2-> "Text Two is Clicked"
            R.id.text3-> "Text Three is Clicked"
            else-> "Settings is Clicked"
        }
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        return true
    }
}