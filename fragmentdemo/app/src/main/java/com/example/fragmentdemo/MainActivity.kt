package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity(),ICommunicator {

    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.root_container,FragmentOne()).addToBackStack("fragmenone").commit()

    }

    override fun getMessage(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        Log.d(TAG,msg)
    }

    override fun getPerson(person: Person) {
        Toast.makeText(this,person.toString(),Toast.LENGTH_LONG).show()
        Log.d(TAG,person.toString())
    }
}