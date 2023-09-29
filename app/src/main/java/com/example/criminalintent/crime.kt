package com.example.criminalintent

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.UUID

data class crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
) {
    fun getFormattedDate(): String {
        val sdf = SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.ENGLISH)
        return sdf.format(date)
    }
}
