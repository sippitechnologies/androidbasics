package com.sippitechnologies.listviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ProductAdapter(val context: Context, val products: List<Product>) : BaseAdapter() {
    var productsList = mutableListOf<Product>()

    init {
        productsList.addAll(products)
    }

    override fun getCount(): Int {
        return productsList.size
    }

    override fun getItem(p0: Int): Any {
        return products.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val iconDelete: ImageView
        val productIcon: ImageView
        val name: TextView
        val price: TextView
        val description: TextView
        val view = p1 ?: LayoutInflater.from(context).inflate(R.layout.item_product, p2, false)
        iconDelete = view.findViewById(R.id.image_delete_icon)
        iconDelete.setTag(p0)
        productIcon = view.findViewById(R.id.product_icon)
        name = view.findViewById(R.id.txt_product_name)
        description = view.findViewById(R.id.txt_product_description)
        price = view.findViewById(R.id.txt_product_price)
        iconDelete.setOnClickListener {
            val clickedIndex = it.tag as Int
            productsList.removeAt(clickedIndex)
            notifyDataSetChanged()
        }
        val product = productsList[p0]
        name.text = product.title
        price.text = product.price.toString()
        description.text = product.description
        productIcon.setImageResource(product.imageIcon)





        return view
    }


}