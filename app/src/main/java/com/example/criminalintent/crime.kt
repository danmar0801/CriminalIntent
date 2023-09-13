package com.example.criminalintent

import java.util.Date
import java.util.UUID

data class crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
)
