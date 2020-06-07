package com.sippitechnologies.activitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG="MainActivity"
      val MSG="Message"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"I am in OnCreate")
        supportActionBar?.title="My App Home"
        intent.extras?.let{
            val msgfromFirstActivity= intent.getStringExtra(MSG)
            Toast.makeText(this,msgfromFirstActivity, Toast.LENGTH_LONG).show()
        }

        textView_first.setOnClickListener {
            val message = editText_msg.text.toString()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(MSG,message)
            startActivityForResult(intent,100)
        }
        registerForContextMenu(textView_first)

    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
      val msg=  when(item.itemId)
        {
            R.id.menuitem_add-> "Add Item is Clicked"
            R.id.menuitem_delete->"Delete Item is Clicked"
            R.id.menuitem_updte-> "Update Item is Clicked"
            else-> "Settings is Clicked"

        }
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        return true
    }



    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.activity_main_menu,menu)
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
