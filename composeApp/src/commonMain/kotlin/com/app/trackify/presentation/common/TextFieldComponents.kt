package com.app.trackify.presentation.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Composables for text fields
 */

@Composable
fun DefaultTextField(
    modifier: Modifier = Modifier,
    inputTextColor: Color = Color.Black,
    inputType: KeyboardType = KeyboardType.Text,
    hint: String,
    onTextChanged: (String) -> Unit
) {
    var textField by remember {
        mutableStateOf(TextFieldValue(""))
    }
    Box(modifier) {
        OutlinedTextField(
            value = textField,
            textStyle = StyleOptions.customTextStyle(
                color = inputTextColor, fontFamily = FontFamily.Monospace, fontSize = 16.sp
            ),
            placeholder = {
                MediumText(text = hint, color = Color.LightGray)
            },
            shape = RoundedCornerShape(10.dp),
            onValueChange = { updatedString ->
                textField = updatedString
                onTextChanged.invoke(textField.text)
            },
            keyboardOptions = KeyboardOptions(keyboardType = inputType),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = inputTextColor,
                cursorColor = inputTextColor,
                focusedBorderColor = inputTextColor
            )
        )
    }

}