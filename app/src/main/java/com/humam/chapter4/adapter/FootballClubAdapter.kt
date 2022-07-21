package com.humam.chapter4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.humam.chapter4.databinding.ItemFootballClubBinding

class FootballClubAdapter : RecyclerView.Adapter<FootballClubAdapter.FootballClubViewHolder>() {

    private var footballClub: ArrayList<String> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballClubViewHolder {
        val itemBinding = ItemFootballClubBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FootballClubViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: FootballClubViewHolder, position: Int) {
        holder.bind(footballClub[position])
    }

    override fun getItemCount(): Int {
        return footballClub.size
    }

    fun setItems(items: ArrayList<String>) {
        this.footballClub = items
        notifyDataSetChanged()
    }

    inner class FootballClubViewHolder(val binding: ItemFootballClubBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String) {
            binding.tvClub.text = item
        }
    }
}