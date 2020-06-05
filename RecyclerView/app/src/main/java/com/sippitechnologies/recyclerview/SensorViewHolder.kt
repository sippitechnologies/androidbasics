package com.sippitechnologies.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class SensorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var textTitle:TextView
    var textId:TextView
    var icon:ImageView
    var root:CardView

    init {
        textTitle = view.findViewById(R.id.textView_title)
        textId = view.findViewById(R.id.textView_id)
        icon = view.findViewById(R.id.imageView_sensor_icon)
        root= view.findViewById(R.id.sensor_item_root)
    }
    open fun onBind(sensor:Sensor)
    {
         textTitle.text= sensor.title
         textId.text=sensor.id.toString()
        icon.setImageDrawable(sensor.icon)
    }
}