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
        multiselecitonlistview.choiceMode = ListView.CHOICE_MODE_MULTIPLE
        multiselecitonlistview.adapter = fruitAdapter
        btn_multiply_choice.setOnClickListener {
            Toast.makeText(this,getListofSelectedItems().toString(),Toast.LENGTH_LONG).show()
        }

    }
    fun getListofSelectedItems():List<String>
    {
        val listofCheckItems= mutableListOf<String>()
        val checkedItems = multiselecitonlistview.checkedItemPositions
        for (i in 0 until checkedItems.size())
        {
            val position = checkedItems.keyAt(i)
            if(checkedItems.valueAt(i))
            {
                listofCheckItems.add(fruitAdapter.getItem(position)!!)
            }
        }
        return listofCheckItems

    }


}