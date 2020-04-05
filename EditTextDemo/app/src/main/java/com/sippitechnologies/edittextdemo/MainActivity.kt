package com.sippitechnologies.edittextdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            editText.text=null
            editText2.text=null
            editText3.text=null
            editText4.text=null
        }
        button2.setOnClickListener{
            if(!TextUtils.isEmpty(editText.text)&& !TextUtils.isEmpty(editText2.text) && !TextUtils.isEmpty(editText3.text) && !TextUtils.isEmpty(editText4.text))
            {
                Toast.makeText(MainActivity@this,"Data Submit Successfully",Toast.LENGTH_LONG).show()
                editText.text=null
                editText2.text=null
                editText3.text=null
                editText4.text=null
            }
            else
            {
                 if(editText.text.isEmpty())
                 {
                     editText.error = "Enter Valid Email"
                     return@setOnClickListener
                 }
                else if(editText2.text.isEmpty())
                 {
                     editText2.error = "Enter Valid Phone"
                     return@setOnClickListener
                 }
                else if(editText3.text.isEmpty())
                 {
                     editText3.error = "Enter Valid Date"
                     return@setOnClickListener
                 }
                else if(editText4.text.isEmpty())
                 {
                     editText4.error = "Enter Mulitline Text"
                     return@setOnClickListener
                 }
            }
        }

    }

}
