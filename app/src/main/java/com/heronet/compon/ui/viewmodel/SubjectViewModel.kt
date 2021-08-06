package com.heronet.compon.ui.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.heronet.compon.ui.data.repository.SubjectRepository
import com.heronet.compon.ui.model.Subject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SubjectViewModel @Inject constructor(private val repository: SubjectRepository): ViewModel() {
    var subjects: LiveData<List<Subject>> = repository.getSubjects().asLiveData()

    fun addSubject(subject: Subject) {
        viewModelScope.launch {
            repository.addSubject(subject)
        }
    }
}