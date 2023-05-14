package com.example.submissionaplikasiandroidsederhana

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listAdapter(private val data : ArrayList<player>) : RecyclerView.Adapter<listAdapter.listVewHolder>() {
    private lateinit var listener: onClickListener

    fun OnClickListener(click : onClickListener){
        listener = click

    }

    class listVewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image : ImageView = itemView.findViewById(R.id.image)
        val playersName : TextView = itemView.findViewById(R.id.text_Name)
        val playerDetails : TextView = itemView.findViewById(R.id.text_Details)
        val BtnLike : ImageButton = itemView.findViewById(R.id.like_Button)
        val BtnShare : ImageButton = itemView.findViewById(R.id.share_Button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listVewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return listVewHolder(view)
    }

    override fun onBindViewHolder(holder: listVewHolder, position: Int) {
        val bind = data[position]

        Glide.with(holder.itemView.context)
            .load(bind.photo)
            .apply(RequestOptions().override(130,130))
            .into(holder.image)

        holder.playersName.text = bind.name
        holder.playerDetails.text = bind.details
        holder.itemView.setOnClickListener {
            listener.onclick(bind)
        }
        holder.BtnLike.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Like ${bind.name}", Toast.LENGTH_SHORT).show()
        }

        holder.BtnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share ${bind.name}", Toast.LENGTH_SHORT).show()

        }

    }

    override fun getItemCount(): Int{
        return data.size
    }

    interface onClickListener{
        fun onclick(data: player)
    }
}