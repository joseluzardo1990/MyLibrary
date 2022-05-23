package com.example.postventalibrary1

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun TestView2() {

    val context = LocalContext.current

    Text("Test View 2", modifier = Modifier.clickable {
        context.startActivity(Intent(context, MainActivityLibrary::class.java))
    })
}