package com.example.postventalibrary1

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun TestView1(
    //navController: NavController
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.secondary
        ),
        onClick = {/*navController.navigate("view2")*/},
    ) {
        Text("Navigate to View2")
    }
}