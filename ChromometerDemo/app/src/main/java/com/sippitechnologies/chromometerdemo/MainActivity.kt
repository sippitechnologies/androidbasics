package com.sippitechnologies.chromometerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btn_clear_format.setOnClickListener(this)
        btn_start.setOnClickListener(this)
        btn_stop.setOnClickListener(this)
        btn_format.setOnClickListener(this)
        timer.setOnChronometerTickListener {
            Toast.makeText(this@MainActivity,"Tick Happend",Toast.LENGTH_LONG).show()
        }


    }

    override fun onClick(p0: View?) {
        when(p0?.id)
        {
            R.id.btn_stop-> timer.stop()
            R.id.btn_start-> timer.start()
            R.id.btn_format-> timer.format="Timer is Running : %s"
            else -> timer.format=null
        }

    }


}