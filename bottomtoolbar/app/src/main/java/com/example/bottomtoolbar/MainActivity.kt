package com.example.bottomtoolbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomactionbar.setNavigationOnClickListener {
            showToast("I am Navigation Icon of Bottom ActionBar")

        }
        bottomactionbar.setOnMenuItemClickListener {
            when(it.itemId)
            {
                R.id.add->
                {
                    showToast("Add is Clicked")
                    true
                }
                R.id.delete->
                {
                    showToast("Delete is Clicked")
                    true
                }
                R.id.edit->
                {
                    showToast("Edit is Clicked")
                    true
                }
                else->
                {
                    showToast("Favourite is Clicked")
                    true
                }
            }

        }
        floatingActionButton2.setOnClickListener {
            showToast("I am Floating Button of Bottom ActionBar")
        }

    }
    fun showToast(message:String)
    {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

}