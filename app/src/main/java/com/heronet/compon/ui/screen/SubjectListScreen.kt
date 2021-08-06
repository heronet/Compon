package com.heronet.compon.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.heronet.compon.ui.model.Subject
import com.heronet.compon.ui.viewmodel.SubjectViewModel

@Composable
fun SubjectListScreen(navHostController: NavHostController) {
    val subjectViewModel: SubjectViewModel = hiltViewModel()
    val subjects = subjectViewModel.subjects.observeAsState(listOf()).value
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navHostController.navigate("add-subject") }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Button")
            }
        },
        scaffoldState = scaffoldState,
    ) { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(subjects) {
                SubjectItem(subject = it)
            }
        }
    }
}

@Composable
fun SubjectItem(subject: Subject) {
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth(), elevation = 4.dp) {
        Text(
            text = subject.title,
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp),
            fontSize = 24.sp,
            color = MaterialTheme.colors.onSurface
        )
    }
}