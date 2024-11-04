package com.app.trackify.presentation.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity

@Composable
fun VerticalSpacer(verticalGap: Number) {
    with(LocalDensity.current) {
        Spacer(modifier = Modifier.height(verticalGap.toInt().toDp()))
    }
}

@Composable
fun HorizontalSpacer(horizontalGap: Number) {
    with(LocalDensity.current) {
        Spacer(modifier = Modifier.height(horizontalGap.toInt().toDp()))
    }
}