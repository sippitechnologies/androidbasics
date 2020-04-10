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
        button.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("AlertDialog with One Button")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("I am Message for One Button Alert Dialog")
                .setPositiveButton("Ok",DialogInterface.OnClickListener { dialog, which ->
                    dialog.dismiss()
                })
           val alertdialog = alertDialogBuilder.create()
            alertdialog.show()
        }
        button2.setOnClickListener{
            val alertDialogBuilder = AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("AlertDialog with One Button")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("I am Message for One Button Alert Dialog")
                .setPositiveButton("Ok", { dialog, which ->
                    dialog.dismiss()
                })
            val alertdialog = alertDialogBuilder.create()
            alertdialog.show()

        }
        button3.setOnClickListener {

            val alertDialogBuilder = AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("AlertDialog with One Button")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("I am Message for One Button Alert Dialog")
                .setPositiveButton("Ok", { dialog, which ->
                    dialog.dismiss()
                })
                .setNegativeButton("Cancel",DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(this,"Cancel is Clicked",Toast.LENGTH_LONG).show()
                }).setNeutralButton("MayBe",{dialog,which->
                    Toast.makeText(this,"May be Clicked",Toast.LENGTH_LONG).show()
                })
            val alertdialog = alertDialogBuilder.create()
            alertdialog.show()
        }
    }
}
