package com.heronet.compon.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.heronet.compon.ui.viewmodel.SubjectViewModel

@Composable
fun SubjectListScreen(navHostController: NavHostController) {
    val subjectViewModel: SubjectViewModel = hiltViewModel()
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

        }
    }
}

