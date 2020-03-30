package com.sippitechnologies.radiobuttondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.RelativeLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layoutParams = maincontainer.layoutParams

        rg_alignment.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
         val direction = when(checkedId)
            {
                R.id.rb_bottom-> "Bottom"
                R.id.rb_center->"Center"
                R.id.rb_top-> "Top"
                R.id.right-> "Right"
                else-> "Left"
            }
            label.text = direction

        })
    }
}
