package com.heronet.compon.ui.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.heronet.compon.ui.model.Subject

@Database(entities = [Subject::class], version = 1)
abstract class ComponDb: RoomDatabase() {
    abstract fun getComponDao(): ComponDao
}