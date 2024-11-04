package com.app.trackify.presentation.welcome

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.app.trackify.getPlatform
import com.app.trackify.presentation.login.Login
import kotlinx.coroutines.delay

@Composable
fun WelcomeBoard(modifier: Modifier = Modifier) {
    var platform by remember {
        mutableStateOf("")
    }

    var index by remember {
        mutableStateOf(0)
    }

    LaunchedEffect(key1 = platform) {
        val name = "Hello ${getPlatform().name}!"
        delay(100)
        if (name.isNotEmpty() && index < name.length) {
            platform += name[index++]
        }
    }
    val scrollState = rememberScrollState()
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
       Login(onSubmit = { userName, password ->

       })
    }
}