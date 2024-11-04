package com.app.trackify.presentation.common

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit

/**
 * Files for common composables
 */
@Composable
fun SmallText(modifier: Modifier = Modifier, text: String, color: Color = Color.LightGray) {
    Box(modifier) {
        Text(text = text, style = StyleOptions.smallTextStyle(color = color))
    }
}

@Composable
fun MediumText(modifier: Modifier = Modifier, text: String, color: Color = Color.DarkGray) {
    Box(modifier) {
        Text(text = text, style = StyleOptions.mediumTextStyle(color = color))
    }
}

@Composable
fun LargeText(modifier: Modifier = Modifier, text: String, color: Color = Color.Black) {
    Box(modifier) {
        Text(text = text, style = StyleOptions.largeTextStyle(color = color))
    }
}

@Composable
fun CustomText(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
    fontFamily: FontFamily,
    fontSize: TextUnit
) {
    Box(modifier) {
        Text(
            text = text,
            style = StyleOptions.customTextStyle(
                color = color,
                fontFamily = fontFamily,
                fontSize = fontSize
            )
        )
    }
}


