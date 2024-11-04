package com.app.trackify.presentation.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.trackify.getPlatform
import com.app.trackify.presentation.common.CustomText
import com.app.trackify.presentation.common.DefaultTextField
import com.app.trackify.presentation.common.LargeText
import com.app.trackify.presentation.common.MediumText
import com.app.trackify.presentation.common.SmallText
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
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.verticalScroll(state = scrollState)
        ) {
            SmallText(
                text = platform,
                color = Color.DarkGray,
            )
            MediumText(
                text = platform,
                color = Color.DarkGray,
            )
            LargeText(
                text = platform,
                color = Color.DarkGray,
            )
            CustomText(
                text = platform,
                color = Color.DarkGray,
                fontFamily = FontFamily.Monospace,
                fontSize = 36.sp
            )
            DefaultTextField {
                println("Updated text is $it")
            }
        }
    }
}