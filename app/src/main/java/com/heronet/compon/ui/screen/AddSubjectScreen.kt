package com.heronet.compon.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.heronet.compon.ui.model.Subject
import com.heronet.compon.ui.viewmodel.SubjectViewModel

@Composable
fun AddSubjectScreen(navHostController: NavHostController) {
    var title by remember {
        mutableStateOf("")
    }
    val subjectViewModel: SubjectViewModel = hiltViewModel()

    Column(modifier = Modifier.padding(8.dp)) {
        TextField(
            value = title,
            onValueChange = { title = it },
            maxLines = 1,
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Subject") }
        )
        Button(
            onClick = { addSubject(title, subjectViewModel, navHostController) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
        ) {
            Text(text = "Done")
        }
    }
}

fun addSubject(title: String, subjectViewModel: SubjectViewModel, navHostController: NavHostController) {
    val subject = Subject(title = title, complete = false)
    subjectViewModel.addSubject(subject)
    navHostController.popBackStack()
}