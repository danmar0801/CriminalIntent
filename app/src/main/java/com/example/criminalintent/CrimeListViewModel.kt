package com.example.criminalintent

import androidx.lifecycle.ViewModel
import java.util.Date
import java.util.UUID


class CrimeListViewModel : ViewModel() {
    val crimes = mutableListOf<crime>()

    init {
        for (i in 0 until 100) {
            val crime = crime(
                id = UUID.randomUUID(),
                title = "Crime #$i",
                date = Date(),
                isSolved = i % 2 ==0
            )
            crimes += crime
        }
    }
}
