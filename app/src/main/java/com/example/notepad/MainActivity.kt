package com.example.notepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import android.widget.RelativeLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.notepad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.rvListOfNotes.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)

        var list = ArrayList<ListItem>()
        list.add(ListItem("Perviy note", "12.11.2020"))

        binding.rvListOfNotes.hasFixedSize()
        binding.rvListOfNotes.layoutManager = LinearLayoutManager(this)
        binding.rvListOfNotes.adapter = NotesAdapter(list,this)


    }
}