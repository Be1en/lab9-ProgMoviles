package com.miempresa.labotario9_2.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.miempresa.labotario9_2.model.Stopwatch

@Database(entities = [Stopwatch:: class], version = 1, exportSchema = false)
abstract class StopwatchDataBase : RoomDatabase(){
    abstract fun stopDao() : StopwachDataDao
}

