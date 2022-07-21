package com.humam.chapter4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.humam.chapter4.databinding.ItemListMovieBinding
import com.humam.chapter4.model.Movies

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private val movies: ArrayList<Movies> = arrayListOf() // list of movies

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val itemBinding = ItemListMovieBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemBinding) // return view holder, which is item binding, and pass it to view holder
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(movies[position]) // bind data to view holder, using data binding
    }

    override fun getItemCount(): Int {
        return movies.size // return size of data, so we can show data in recycler view
    }

    fun setItems(items: ArrayList<Movies>) {
        movies.clear() // clear previous data, Memastikan data yang baru masuk tidak mengganggu data yang lama
        movies.addAll(items) // add new data
        notifyDataSetChanged() // refresh recycler view
    }

    inner class MoviesViewHolder(val binding: ItemListMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movies) {
            binding.tvGenre.text = item.genre
            binding.tvReleaseDate.text = item.release
            binding.tvRating.text = item.rating
        } // bind data to view holder, using data binding
    }
}