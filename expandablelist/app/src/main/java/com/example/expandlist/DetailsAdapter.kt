package com.example.expandlist

import android.content.Context
import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListAdapter
import android.widget.TextView

class DetailsAdapter(val context: Context,val groups:List<String>, val groupDetail:List<HashMap<String,List<String>>>) :
    ExpandableListAdapter
{
    override fun registerDataSetObserver(observer: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun getGroupCount(): Int {
        return groups.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
       return groupDetail.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return groupPosition
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return groupDetail.get(groupPosition)[groupPosition]!!.get(childPosition)
    }

    override fun getGroupId(groupPosition: Int): Long {
       return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
       return childPosition.toLong()
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val view = convertView?: LayoutInflater.from(context).inflate(R.layout.item_group,parent,false)
        val groupTitle = groups.get(groupPosition)
        val title:TextView= view.findViewById(R.id.txt_group_title)
        title.text=groupTitle
        return view
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        val view = convertView?: LayoutInflater.from(context).inflate(R.layout.item_child,parent,false)
        val childTitle = getChild(groupPosition,childPosition) as
        val title:TextView= view.findViewById(R.id.txt_child_title)
        title.text=childTitle
        return view
    }

}