package com.sippitechnologies.activitydemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    val TAG="SecondActivity"
    val MSG="Message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="About Us"
        Log.d(TAG,"I am in OnCreate")
        intent.extras?.let{
            val msgfromFirstActivity= intent.getStringExtra(MSG)
            Toast.makeText(this,msgfromFirstActivity, Toast.LENGTH_LONG).show()
        }
        textView_second.setOnClickListener {
            val message = editText_msg1.text.toString()

            val intent = Intent(this,ThirdActivity::class.java)
            intent.putExtra(MSG,message)
            startActivityForResult(intent,100)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_main_menu,menu)
        return true
    }





    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode==100)
        {
            val msg = data?.getStringExtra(MSG)
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"I am in OnStart")
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home)
        {
            setResult(100,intent.putExtra(MSG,"Result got from Second Activity for Main Activity"))
            finish()
        }
        else
        {
            val msg = when(item.itemId)
            {
                R.id.menuitem_add-> "Add is Clicked"
                R.id.menuitem_updte->"Update is Clicked"
                R.id.menuitem_delete->"Delete is Clicked"
                else-> "Settings is Clicked"
            }
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show()

        }
        return true
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