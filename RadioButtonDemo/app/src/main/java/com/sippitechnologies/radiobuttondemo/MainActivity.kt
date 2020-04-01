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
        rg_direction.setOnCheckedChangeListener({ radioGroup: RadioGroup, i: Int ->
            val direction= when(i)
            {
                R.id.rb_right-> resources.getString(R.string.right)
                R.id.rb_top-> resources.getString(R.string.top)
                R.id.rb_bottom-> resources.getString(R.string.bottom)
                R.id.rb_center-> resources.getString(R.string.center)
                else -> resources.getString(R.string.left)
            }
            txt_label.text = direction

        })
    }
}
