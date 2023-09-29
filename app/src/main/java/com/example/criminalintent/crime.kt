package com.example.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.UUID

@Entity
data class crime(
    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
) {
    fun getFormattedDate(): String {
        val sdf = SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.ENGLISH)
        return sdf.format(date)
    }
}
