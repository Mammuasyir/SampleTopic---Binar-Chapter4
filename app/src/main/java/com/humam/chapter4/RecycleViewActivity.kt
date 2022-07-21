package com.humam.chapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.humam.chapter4.adapter.FootballClubAdapter
import com.humam.chapter4.adapter.PlayerClubAdapter
import com.humam.chapter4.databinding.ActivityRecycleViewBinding
import com.humam.chapter4.model.PlayerFootball

class RecycleViewActivity : AppCompatActivity() {

    var binding: ActivityRecycleViewBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        val adapterFootball = FootballClubAdapter()
//        binding?.rvFootballClub?.apply {
//            adapter = adapterFootball
//            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
//        }

        val adapterPlayer = PlayerClubAdapter()
        binding?.rvFootballClub?.adapter = adapterPlayer
        binding?.rvFootballClub?.layoutManager = LinearLayoutManager(this)

        val items = getPlayerClub()
        adapterPlayer.setItems(items)

    }

    fun getFootballClub() : ArrayList<String>{
        return arrayListOf("Barcelona", "Real Madrid", "Juventus", "Liverpool", "Bayern", "PSG", "Paris", "Lyon", "Marseille", "Tottenham")
    }

    fun getPlayerClub() : ArrayList<PlayerFootball>{
        return arrayListOf(PlayerFootball("Messi", "PSG"),
            PlayerFootball("Ronaldo", "Juventus"),
            PlayerFootball("Kane", "Liverpool"),
            PlayerFootball("Benzema", "Real Madrid"),
            PlayerFootball("Modric", "Bayern"),
            PlayerFootball("Neymar", "Paris"),
            PlayerFootball("Lampard", "Lyon"),
            PlayerFootball("Puyol", "Marseille"),
            PlayerFootball("Salah", "Tottenham"))
    }
}