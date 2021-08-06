package com.heronet.compon.ui.data.repository

import com.heronet.compon.ui.data.db.ComponDao
import com.heronet.compon.ui.model.Subject
import javax.inject.Inject

class SubjectRepository @Inject constructor(private val componDao: ComponDao) {
    fun getSubjects() = componDao.getSubjects()
    suspend fun addSubject(subject: Subject) = componDao.addSubject(subject)
}