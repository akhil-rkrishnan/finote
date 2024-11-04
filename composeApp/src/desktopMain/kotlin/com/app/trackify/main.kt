package com.app.trackify

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.app.trackify.presentation.welcome.WelcomeBoard

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Trackify",
    ) {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background, elevation = 4.dp) {
            WelcomeBoard()
        }
    }
}