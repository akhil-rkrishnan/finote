package com.app.trackify.presentation.common

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

data object StyleOptions {
    fun smallTextStyle(color: Color = Color.DarkGray, fontFamily: FontFamily = FontFamily.Cursive) =
        TextStyle(
            color = color,
            fontSize = 12.sp,
            fontWeight = FontWeight(500),
            fontFamily = fontFamily
        )

    fun mediumTextStyle(
        color: Color = Color.DarkGray,
        fontFamily: FontFamily = FontFamily.Cursive
    ) =
        TextStyle(
            color = color,
            fontSize = 16.sp,
            fontWeight = FontWeight(500),
            fontFamily = fontFamily
        )

    fun largeTextStyle(color: Color = Color.DarkGray, fontFamily: FontFamily = FontFamily.Cursive) =
        TextStyle(
            color = color,
            fontSize = 18.sp,
            fontWeight = FontWeight(500),
            fontFamily = fontFamily
        )

    fun customTextStyle(
        color: Color = Color.DarkGray,
        fontFamily: FontFamily = FontFamily.Cursive,
        fontSize: TextUnit
    ) =
        TextStyle(
            color = color,
            fontSize = fontSize,
            fontWeight = FontWeight(500),
            fontFamily = fontFamily
        )


}
