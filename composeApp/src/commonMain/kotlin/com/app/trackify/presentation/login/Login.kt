package com.app.trackify.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import com.app.trackify.presentation.common.DefaultTextField
import com.app.trackify.presentation.common.MediumText
import com.app.trackify.presentation.common.VerticalSpacer

@Composable
fun Login(modifier: Modifier = Modifier, onSubmit: (userName: String, password: String) -> Unit) {
    var loginCreds by remember {
        mutableStateOf(Pair("", ""))
    }
    Box(modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Column(modifier = modifier) {
            MediumText(text = "Enter username")
            VerticalSpacer(5)
            DefaultTextField(hint = "Username") {
                loginCreds = Pair(it, loginCreds.second)
            }
            VerticalSpacer(10)
            MediumText(text = "Enter password")
            VerticalSpacer(5)
            DefaultTextField(hint = "Password", inputType = KeyboardType.Password) {
                loginCreds = Pair(loginCreds.first, it)
            }
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                MediumText(text = "Forgot password?")
                MediumText(text = "New User?")
            }
        }
    }
}