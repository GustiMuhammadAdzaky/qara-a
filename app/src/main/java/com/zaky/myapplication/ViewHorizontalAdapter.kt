package com.zaky.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ViewHorizontalAdapter (private val listNabi: ArrayList<Nabi>) : RecyclerView.Adapter<ViewHorizontalAdapter.CardViewViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Nabi)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.rv_image)
//        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
//        var tvTurun: TextView = itemView.findViewById(R.id.tv_item_turun)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.rv_horizon_nabi, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val nabi = listNabi[position]

        Glide.with(holder.itemView.context)
            .load(nabi.photo)
            .apply(RequestOptions().override(350, 350))
            .into(holder.imgPhoto)
//        holder.tvName.text = nabi.nama
//        holder.tvTurun.text = nabi.turun
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listNabi[holder.adapterPosition]) }
    }
    override fun getItemCount(): Int {
        return listNabi.size
    }
}

