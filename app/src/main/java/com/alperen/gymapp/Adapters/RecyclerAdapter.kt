package com.alperen.gymapp.Adapters

import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import com.alperen.gymapp.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var titles = arrayOf("Squat","Chair Dips","Lunge","Plank","Pull Up","Push Up","Side Plank","Star Jump")

    private var details = arrayOf("Click for details","Click for details","Click for details","Click for details","Click for details","Click for details","Click for details","Click for details")

    private var images = intArrayOf(R.drawable.squates,R.drawable.chairdips,R.drawable.lungs,R.drawable.plank,R.drawable.pullups,R.drawable.pushups,R.drawable.sideplank,R.drawable.star_jump)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])

    }


    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)


            itemView.setOnClickListener{
                val position: Int = adapterPosition

                Toast.makeText(itemView.context,"you clicked on ${titles[position]}",Toast.LENGTH_LONG).show()

            }
        }

    }
}