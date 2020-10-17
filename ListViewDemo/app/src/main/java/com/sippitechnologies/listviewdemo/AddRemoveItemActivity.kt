package com.sippitechnologies.listviewdemo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_remove_item.*
import kotlin.random.Random

class AddRemoveItemActivity : AppCompatActivity() {


    lateinit var  productAdapterAddRemove: ProductAdapterAddRemove
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_remove_item)
        productAdapterAddRemove = ProductAdapterAddRemove(this,Data.productsList)
        listview_addremove.adapter= productAdapterAddRemove
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.add) {
            val randomProduct = Data.productsList.get(Random.nextInt(10))
            productAdapterAddRemove.addProduct(randomProduct)
            productAdapterAddRemove.notifyDataSetChanged()

        }
        return true

    }
}