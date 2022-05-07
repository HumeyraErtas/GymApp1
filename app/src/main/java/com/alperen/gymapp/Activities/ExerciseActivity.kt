package com.alperen.gymapp.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alperen.gymapp.Adapters.RecyclerAdapter
import com.alperen.gymapp.R
import kotlinx.android.synthetic.main.activity_exercise.*

class ExerciseActivity : AppCompatActivity() {

    private var layoutManager : RecyclerView.LayoutManager?= null

    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        layoutManager = LinearLayoutManager(this)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter

    }






}