package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val products = listOf<Product>(Product(R.drawable.earring,"Good Morning"),
        Product(R.drawable.pandent,"Pendeded"),Product
    (R.drawable.ring,"Ring"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val produtAdapter = ProdutAdapter(this,products)
        intro_slider.adapter = produtAdapter

    }
}