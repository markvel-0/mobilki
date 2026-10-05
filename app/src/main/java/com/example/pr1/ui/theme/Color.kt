package com.example.pr1.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

data class AppColors(
    val primary: Color,
    val disabledButton: Color,
    val disabledField: Color,
    val success: Color,
    val red: Color,
    val yellow: Color,
    val grey: Color,
    val blackFont: Color,
    val offColor: Color,
    val gray5: Color,
    val placeHolder: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        primary = Color.Unspecified,
        disabledButton = Color.Unspecified,
        disabledField = Color.Unspecified,
        success = Color.Unspecified,
        red = Color.Unspecified,
        yellow = Color.Unspecified,
        grey = Color.Unspecified,
        blackFont = Color.Unspecified,
        offColor = Color.Unspecified,
        gray5 = Color.Unspecified,
        placeHolder = Color.Unspecified
    )
}