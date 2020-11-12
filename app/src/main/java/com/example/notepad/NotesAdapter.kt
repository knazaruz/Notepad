package com.example.notepad

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class NotesAdapter (listArray: ArrayList<ListItem>, context: Context): RecyclerView.Adapter<NotesAdapter.ViewHolder>()
{
    var listArray = listArray
    var contextR = context

    class ViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        var notesTitle = view.findViewById<TextView>(R.id.noteTitle)
        var notesDate = view.findViewById<TextView>(R.id.noteDate)

        fun bind(listItem: ListItem, context: Context)
        {
            notesTitle.text = listItem.noteTitle
            notesDate.text = listItem.noteDate
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflator = LayoutInflater.from(contextR)
        return ViewHolder(inflator.inflate(R.layout.one_item_rv,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var listItem = listArray.get(position)
        holder.bind(listItem,contextR)
    }

    override fun getItemCount(): Int
    {
        return listArray.size
    }

}