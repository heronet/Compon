package com.heronet.compon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.navigation.compose.rememberNavController
import com.heronet.compon.ui.screen.NavHostScreen
import com.heronet.compon.ui.theme.ComponTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val scaffoldState = rememberScaffoldState()
                    val navController = rememberNavController()
                    Scaffold(
                        topBar = {
                            TopAppBar {

                            }
                        },

                        scaffoldState = scaffoldState
                    ) { paddingValues ->
                        NavHostScreen(
                            navHostController = navController,
                            startDestination = "subjects",
                            paddingValues = paddingValues
                        )
                    }
                }
            }
        }
    }
}
