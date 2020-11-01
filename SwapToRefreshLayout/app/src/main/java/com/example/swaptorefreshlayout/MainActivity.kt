package com.example.swaptorefreshlayout

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val titles = listOf(
            "Good Morning",
            "Hello",
            "Namaste",
            "Good Afternoon",
            "Good Evening",
            "Good Night"
        )
        setContentView(R.layout.activity_main)
        root.setOnRefreshListener {
            Handler(Looper.getMainLooper()).postDelayed({
                val titleofProduct = titles.get(Random.nextInt(titles.size))
                label.text= titleofProduct
                root.isRefreshing=false

            },2000)

        }

    }
}