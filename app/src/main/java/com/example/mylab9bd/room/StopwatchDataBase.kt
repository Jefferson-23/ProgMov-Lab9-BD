package com.example.mylab9bd.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mylab9bd.model.Stopwatch

@Database(entities = [Stopwatch:: class], version = 1, exportSchema = false)
abstract class StopwatchDataBase : RoomDatabase() {
    abstract fun stopDao(): StopwachDataDao
}