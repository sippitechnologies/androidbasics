package com.sippitechnologies.listviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_custom_list_view.*

class CustomListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)
        val productAdapter = ProductAdapter(this,Data.productsList)
        listview_custom.adapter = productAdapter

    }
}