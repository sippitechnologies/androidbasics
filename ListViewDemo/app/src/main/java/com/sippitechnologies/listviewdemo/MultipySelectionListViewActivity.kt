package com.sippitechnologies.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_multi.*

class MultipySelectionListViewActivity : AppCompatActivity() {
    lateinit var fruitAdapter:ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi)
        fruitAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,Data.fruitnames)
        multiselecitonlistview.adapter = fruitAdapter
        multiselecitonlistview.choiceMode = ListView.CHOICE_MODE_MULTIPLE
        btn_multiply_choice.setOnClickListener {
            Toast.makeText(this,getListofSelectedItem().toString(),Toast.LENGTH_LONG).show()
        }


    }
    fun getListofSelectedItem():List<String>
    {
        val checked = multiselecitonlistview.checkedItemPositions
        val checkitems= mutableListOf<String>()
        for(i in 0 until checked.size())
        {
            val position = checked.keyAt(i)
            if(checked.valueAt(i))
            {
                checkitems.add(fruitAdapter.getItem(position)!!)
            }
        }
        return checkitems
    }
}