package com.sippitechnologies.chromometerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{

    var offset:Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btn_clear_format.setOnClickListener(this)
        btn_start.setOnClickListener(this)
        btn_stop.setOnClickListener(this)
        btn_format.setOnClickListener(this)
        btn_reset.setOnClickListener(this)
        timer.setOnChronometerTickListener {
           // Toast.makeText(this@MainActivity,"Tick Happend",Toast.LENGTH_LONG).show()
        }


    }




    override fun onClick(p0: View?) {
        when(p0?.id)
        {
            R.id.btn_stop-> {
                timer.stop()
                offset= SystemClock.elapsedRealtime()-timer.base

                btn_start.isEnabled=true
                btn_stop.isEnabled=false
                btn_reset.isEnabled=true
            }
            R.id.btn_start->{
                timer.base = SystemClock.elapsedRealtime()-offset
                timer.start()

                btn_start.isEnabled=false
                btn_stop.isEnabled=true
                btn_reset.isEnabled=false

            }
            R.id.btn_format-> timer.format="Timer is Running : %s"
            R.id.btn_reset->{
                timer.base = SystemClock.elapsedRealtime()
                offset=0
                btn_reset.isEnabled=false


            }
            else -> timer.format=null
        }

    }


}