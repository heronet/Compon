package com.heronet.compon.ui.data.repository

import com.heronet.compon.ui.data.db.ComponDao
import javax.inject.Inject

class SubjectRepository @Inject constructor(private val componDao: ComponDao) {
    fun getSubjects() = componDao.getSubjects()
}