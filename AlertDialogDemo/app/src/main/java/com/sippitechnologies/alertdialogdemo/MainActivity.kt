package com.sippitechnologies.alertdialogdemo

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_one.setOnClickListener{
            val builder= AlertDialog.Builder(this).setTitle(R.string.alertdailogwithonebutton)
                .setMessage(R.string.alertdailogwithonebutton)
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton(R.string.submit,DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,R.string.submit_msg,Toast.LENGTH_LONG).show()
                })
            val alertDialog= builder.create()
            alertDialog.show()


        }
        btn_two.setOnClickListener{
            val builder= AlertDialog.Builder(this).setTitle(R.string.alertdialogwithtwbutton)
                .setMessage(R.string.alertdialogwithtwbutton)
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton(R.string.submit,DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,R.string.submit_msg,Toast.LENGTH_LONG).show()
                })
                .setNegativeButton(R.string.cancel,DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,R.string.cancel_msg,Toast.LENGTH_LONG).show()
                })
            val alertDialog= builder.create()
            alertDialog.show()

        }
        btn_three.setOnClickListener{
            val builder= AlertDialog.Builder(this).setTitle(R.string.alertdialogwithtwbutton)
                .setMessage(R.string.alertdialogwithtwbutton)
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton(R.string.submit,DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,R.string.submit_msg,Toast.LENGTH_LONG).show()
                })
                .setNegativeButton(R.string.cancel,DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,R.string.cancel_msg,Toast.LENGTH_LONG).show()
                })
                .setNeutralButton(R.string.maybe,DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,R.string.maybe_msg,Toast.LENGTH_LONG).show()
                })

            val alertDialog= builder.create()
            alertDialog.show()

        }

    }
}
