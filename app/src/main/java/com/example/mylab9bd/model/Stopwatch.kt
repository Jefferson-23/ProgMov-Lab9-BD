package com.example.mylab9bd.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Stopwatch(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    @ColumnInfo(name = "title")
    val title : String,
    @ColumnInfo(name = "time")
    val time : Long
)
