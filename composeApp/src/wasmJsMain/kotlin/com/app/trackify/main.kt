package com.app.trackify

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeViewport
import com.app.trackify.presentation.welcome.WelcomeBoard
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background, elevation = 10.dp) {
            WelcomeBoard()
        }
    }
}