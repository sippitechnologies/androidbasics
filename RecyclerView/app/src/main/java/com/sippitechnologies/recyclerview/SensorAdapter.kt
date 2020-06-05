package com.sippitechnologies.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SensorAdapter(val sensors:List<Sensor>,val onItemRecyclerView:OnItemRecyclerViewClick?=null):RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sensor,parent,false)
        return SensorViewHolder(view)

    }

    override fun getItemCount(): Int {
       return sensors.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val sensor= sensors.get(position)
        val sensorviewHolder= holder as SensorViewHolder
        sensorviewHolder.root.tag=position
        sensorviewHolder.onBind(sensor)
        sensorviewHolder.root.setOnClickListener {
            val selectedIndex = it.tag as Int
                onItemRecyclerView?.let {

                val selectedSensor = sensors.get(selectedIndex)
                    it.onItemClick(selectedIndex,selectedSensor)
            }
        }


    }

}