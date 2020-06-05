package com.sippitechnologies.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),OnItemRecyclerViewClick {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sensors= listOf(Sensor("One",1,resources.getDrawable(R.drawable.office,null)),
            Sensor("Two",1,resources.getDrawable(R.drawable.office,null)),Sensor("One",1,resources.getDrawable(R.drawable.office,null)),
                    Sensor("Three",1,resources.getDrawable(R.drawable.office,null)),
        Sensor("Four",1,resources.getDrawable(R.drawable.rose,null)),
        Sensor("Five",1,resources.getDrawable(R.drawable.temperatureconverter,null))
        ,Sensor("Six",1,resources.getDrawable(R.drawable.rose,null)))
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val sensorAdapter = SensorAdapter(sensors,this)
        recyclerview.adapter=sensorAdapter

    }

    override fun onItemClick(position: Int, sensor: Sensor) {
        Toast.makeText(this,sensor.title,Toast.LENGTH_LONG).show()
    }


}
