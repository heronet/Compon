package com.heronet.compon.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.heronet.compon.ui.data.repository.SubjectRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SubjectViewModel @Inject constructor(private val repository: SubjectRepository): ViewModel() {
    fun getSubjects() = repository.getSubjects()
}