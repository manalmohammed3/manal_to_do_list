package com.example.manal_to_do_list.todoadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.manal_to_do_list.R
import com.example.manal_to_do_list.R.*
import com.example.manal_to_do_list.model.datamodel


class adapter(var context: Context, var datasorce:List<datamodel>) :
    RecyclerView.Adapter<adapter.adapterViewHolder> () {


    class adapterViewHolder( view: View): RecyclerView.ViewHolder(view) {
        val checkbox: CheckBox = view.findViewById(id.checkbox)
        val details: TextView = view.findViewById(id.details)
        val title: TextView = view.findViewById(id.title)
        val CalendarView: CalendarView = view.findViewById(id.calendar)
        val Button: Button = view.findViewById(id.button)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.adapterViewHolder {
        return adapterViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: adapter.adapterViewHolder, position: Int) {
        val item = datasorce[position]
        Toast.makeText(context, "${item.title} -- ${datasorce.size}", Toast.LENGTH_SHORT).show()
        holder.checkbox.setOnClickListener{}
        holder.details.text = item.details
        holder.title.text = item.title
        holder.CalendarView.setOnClickListener{}
        holder.Button.setOnClickListener{ }

    }
    override fun getItemCount(): Int {
        return datasorce.size
    }


}
