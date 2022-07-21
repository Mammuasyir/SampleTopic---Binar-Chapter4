package com.humam.chapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.humam.chapter4.adapter.MoviesAdapter
import com.humam.chapter4.databinding.ActivityRecycleViewMovieBinding
import com.humam.chapter4.model.Movies

class RecycleViewMovieActivity : AppCompatActivity() {

    var binding: ActivityRecycleViewMovieBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleViewMovieBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val adapterMovies = MoviesAdapter()
        binding?.rvMovies?.adapter = adapterMovies
        binding?.rvMovies?.layoutManager = LinearLayoutManager(this)

        val items = getMovies()
        adapterMovies.setItems(items)
    }

    fun getMovies(): ArrayList<Movies> {
        return arrayListOf(Movies("The Shawshank Redemption", "2022", "9"),
            Movies("The Godfather", "2023", "9"),
            Movies("The Godfather: Part II", "2023", "9"),
            Movies("The Dark Knight", "2023", "9"),
            Movies("12 Angry Monkeys", "2023", "9"),
            Movies("Schindler's List", "2023", "9"),
                )

    }
}