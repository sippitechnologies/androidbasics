package com.sippitechnologies.listviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ProductAdapter(val context: Context, val products: List<Product>) : BaseAdapter() {
    override fun getCount(): Int {
        return products.size
    }

    override fun getItem(p0: Int): Any {
        return products.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = p1 ?: LayoutInflater.from(context).inflate(R.layout.item_product, p2, false)
        val productName = view.findViewById<TextView>(R.id.txt_product_name)
        val productPrice = view.findViewById<TextView>(R.id.txt_product_price)
        val productDescription = view.findViewById<TextView>(R.id.txt_product_description)
        val product_icon = view.findViewById<ImageView>(R.id.product_icon)
        val product = products.get(p0)

        productName.text = product.title
        productDescription.text = product.description
        productPrice.text = "\$ ${product.price}"
        product_icon.setImageResource(product.imageIcon)
        return view

    }
}