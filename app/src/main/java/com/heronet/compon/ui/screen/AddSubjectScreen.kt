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
import androidx.navigation.NavHostController

@Composable
fun AddSubjectScreen(navHostController: NavHostController) {
    var title by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.padding(8.dp)) {
        TextField(
            value = title,
            onValueChange = { title = it },
            maxLines = 1,
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Subject") }
        )
        Button(
            onClick = { navHostController.popBackStack() },
            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
        ) {
            Text(text = "Done")
        }
    }
}