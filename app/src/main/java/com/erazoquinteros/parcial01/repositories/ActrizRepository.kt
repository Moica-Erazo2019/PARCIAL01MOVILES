package com.erazoquinteros.parcial01.repositories

import com.erazoquinteros.parcial01.model.ActrizModel

class ActrizRepository(private val actriz: MutableList<ActrizModel>) {

    fun getMovies() = actriz

    // add a new movie to the list of movies dummyData.kt
    fun addMovies(movie: ActrizModel) = actriz.add(movie)


}