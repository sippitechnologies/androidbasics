package com.sippitechnologies.checkboxdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var apple:CheckBox
    lateinit var banana:CheckBox
    lateinit var plum:CheckBox
    lateinit var reset:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apple=findViewById(R.id.chk_apple)
        banana=findViewById(R.id.chk_banana)
        plum=findViewById(R.id.chk_plum)
        reset=findViewById(R.id.btn_resetapp)

        apple.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
            {
                apple.visibility = View.GONE
            }
        }
        plum.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
            {
                plum.visibility = View.GONE
            }
        }
        banana.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
            {
                banana.visibility = View.GONE
            }
        }
        reset.setOnClickListener{
            banana.visibility = View.VISIBLE
            apple.visibility = View.VISIBLE
            plum.visibility = View.VISIBLE
        }


    }
}
