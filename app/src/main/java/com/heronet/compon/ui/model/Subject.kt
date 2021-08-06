package com.heronet.compon.ui.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subjects")
data class Subject(
    @PrimaryKey(autoGenerate = true) val id: Long? = null,
    val title: String,
    val complete: Boolean
)
