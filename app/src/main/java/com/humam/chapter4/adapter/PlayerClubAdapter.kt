package com.humam.chapter4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.humam.chapter4.databinding.ItemPlayerFootballBinding
import com.humam.chapter4.model.PlayerFootball

class PlayerClubAdapter : RecyclerView.Adapter<PlayerClubAdapter.PlayerClubViewHolder>() {

    private val playerClub: ArrayList<PlayerFootball> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerClubViewHolder {
        val itemBinding = ItemPlayerFootballBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return PlayerClubViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PlayerClubViewHolder, position: Int) {
        holder.bind(playerClub[position])
    }

    override fun getItemCount() = playerClub.size

    fun setItems(items: ArrayList<PlayerFootball>) {
        playerClub.clear()
        playerClub.addAll(items)
        notifyDataSetChanged() //untuk ngasitau adapter kalau ada update
    }

    inner class PlayerClubViewHolder(val binding: ItemPlayerFootballBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: PlayerFootball) {
            binding.tvPlayerName.text = item.name
            binding.tvPlayerClub.text = item.club
        }
    }
}