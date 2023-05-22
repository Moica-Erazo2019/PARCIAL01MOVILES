package com.erazoquinteros.parcial01.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.erazoquinteros.parcial01.model.ActrizModel
import com.example.laboratorio05.R




class MovieAdapter : RecyclerView.Adapter<ActrizViewHolder>() {

    private var data: List<ActrizModel>? = null


    fun setDAta(data: List<ActrizModel>) {
        this.data = data
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_movie,parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount() = data?.size ?:0


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        data?.let {
            val movie = it[position]
            holder.bind(movie)
        }
    }

}




