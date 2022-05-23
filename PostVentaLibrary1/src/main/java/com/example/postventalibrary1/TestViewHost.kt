package com.example.postventalibrary1

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun TestViewHost() {

    val navController = rememberNavController()

    NavHost(navController,"view1")
    {
        composable("view1") { backStackEntry ->
            TestView1(navController)
        }
        composable("view2") { backStackEntry ->
            TestView2()
        }

    }

}