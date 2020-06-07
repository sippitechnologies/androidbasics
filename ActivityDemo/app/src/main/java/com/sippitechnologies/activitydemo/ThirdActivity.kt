package com.sippitechnologies.activitydemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    val TAG="ThirdActivity"
    val MSG="Message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Contact Us"
        Log.d(TAG,"I am in OnCreate")
        val msgfromFirstActivity= intent.getStringExtra(MSG)

        Toast.makeText(this,msgfromFirstActivity, Toast.LENGTH_LONG).show()
        setContentView(R.layout.activity_third)
        textView_third.setOnClickListener {
            val message = editText_msg2.text.toString()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(MSG,message)
            startActivity(intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_third_menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home)
        {
            setResult(100,intent.putExtra(MSG,"Result got from Third Activity for Second Activity"))
            finish()
        }
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
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        return true
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"I am in OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"I am in OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"I am in Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"I am in Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"I am in OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"I am in Destroy")
    }
}