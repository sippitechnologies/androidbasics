package com.example.viewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class ProdutAdapter(val context: Context, val products: List<Product>) : PagerAdapter() {
    override fun getCount(): Int {
        return products.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val product = products.get(position)
        val view = LayoutInflater.from(context).inflate(R.layout.intro_view,container,false)
        val title=view.findViewById<TextView>(R.id.textView)
        val icon = view.findViewById<ImageView>(R.id.imageView)
        title.text = product.title
        icon.setImageResource(product.icon)
        container.addView(view)
                return view
    }

}




