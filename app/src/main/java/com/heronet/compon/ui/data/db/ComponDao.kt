package com.heronet.compon.ui.data.db

import androidx.room.Dao
import androidx.room.Query
import com.heronet.compon.ui.model.Subject
import kotlinx.coroutines.flow.Flow

@Dao
interface ComponDao {
    @Query("SELECT * FROM subjects")
    fun getSubjects(): Flow<List<Subject>>


}