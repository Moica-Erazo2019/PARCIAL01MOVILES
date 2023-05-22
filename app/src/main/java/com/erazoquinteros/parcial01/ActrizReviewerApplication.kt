package com.erazoquinteros.parcial01

import android.app.Application
import com.erazoquinteros.parcial01.repositories.ActrizRepository


class ActrizReviewerApplication : Application() {
    val movieRepository: ActrizRepository by lazy {
        ActrizRepository(actriz)
    }
}