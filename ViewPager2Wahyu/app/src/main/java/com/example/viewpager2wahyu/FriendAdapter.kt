package com.example.viewpager2wahyu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FriendAdapter(private  val friends: List<MyFriend>) : RecyclerView.Adapter<FriendAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.TVname)
        val phone: TextView = itemView.findViewById(R.id.TVphone)
        val email: TextView = itemView.findViewById(R.id.TVemail)
        val jekel: TextView = itemView.findViewById(R.id.TVjekel)
        val image: ImageView = itemView.findViewById(R.id.defaultImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_friend_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend = friends[position]
        holder.name.text = friend.name
        holder.jekel.text = friend.jekel
        holder.phone.text = friend.phone
        holder.email.text = friend.email
        holder.image.setImageResource(friend.image)
    }

    override fun getItemCount(): Int = friends.size
}