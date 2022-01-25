package com.example.viewpager

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.size
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.intro_slider
import kotlinx.android.synthetic.main.activity_slider.*

class MainActivityWithButton : AppCompatActivity(),View.OnClickListener {
    val products = listOf<Product>(
        Product(
            R.drawable.earring,
            "Product 1 Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        ),
        Product(
            R.drawable.pandent,
            "Product 2 Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        ),
        Product(
            R.drawable.ring,
            "Product 3 Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        ),
        Product(
            R.drawable.pended2,
            "Product 4 Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)
        val productAdapter = ProductAdapter(products)
        btn_next.setOnClickListener(this)
        btn_previous.setOnClickListener(this)
        btn_skip.setOnClickListener(this)
        intro_slider.adapter = productAdapter
        intro_slider.addOnPageChangeListener(object:ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                val selectedProduct = products.get(position)
               if(position==0)
               {
                   btn_previous.visibility=View.GONE

                   btn_skip.visibility=View.VISIBLE
                   btn_next.visibility=View.VISIBLE
                   btn_next.text="Next"
               }
               else if(position>0)
               {
                   if(position==productAdapter.count-1)
                   {

                       btn_previous.visibility=View.VISIBLE
                       btn_skip.visibility=View.GONE
                       btn_next.visibility=View.VISIBLE
                       btn_next.text="Done"

                   }
                   else
                   {
                       btn_previous.visibility=View.VISIBLE
                       btn_skip.visibility=View.VISIBLE
                       btn_next.visibility=View.VISIBLE
                   }



               }




                Toast.makeText(this@MainActivityWithButton,selectedProduct.title,Toast.LENGTH_LONG).show()

            }
        })
    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.btn_next->
            {
                if(!btn_next.text.toString().equals("Done",true))
                {
                    intro_slider.currentItem+=1
                }

               /* if(intro_slider.currentItem==intro_slider.childCount-1)
                {
                    btn_next.text= "Done"
                }
                else
                {

                    intro_slider.currentItem+=1

                }*/

            }
            R.id.btn_previous->
            {
               intro_slider.currentItem-=1
            }
            else->
            {
                Toast.makeText(this@MainActivityWithButton,"Move to next Screen",Toast.LENGTH_LONG).show()
            }
        }

    }

}