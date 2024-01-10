package com.example.newourchrive.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontLoadingStrategy
import androidx.compose.ui.text.font.FontWeight
import com.example.newourchrive.R

val MyCustomFont = FontFamily(
    listOf(Font(R.font.poppins_bold, FontWeight.Bold, loadingStrategy = FontLoadingStrategy.Blocking),
        Font(R.font.poppins_regular, FontWeight.Normal, loadingStrategy = FontLoadingStrategy.Blocking),
        Font(R.font.poppins_light, FontWeight.Light, loadingStrategy = FontLoadingStrategy.Blocking)) // Replace with your font resource
//    Font(R.font.poppins_bold, FontWeight.Bold, loadingStrategy = FontLoadingStrategy.Blocking),
//    Font(R.font.poppins_extrabold, FontWeight.ExtraBold, loadingStrategy = FontLoadingStrategy.Blocking),
//    Font(R.font.poppins_light, loadingStrategy = FontLoadingStrategy.Blocking)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = MyCustomFont,
        fontWeight = FontWeight.Bold
    ),
    // For Choices
    headlineLarge = TextStyle(
        fontFamily = MyCustomFont,
        fontWeight = FontWeight.Normal
    ),
    // For Questions
    bodyLarge = TextStyle(
        fontFamily = MyCustomFont,
        fontWeight = FontWeight.Light
    )
)

// Set of Material typography styles to start with
//val Typography = Typography(
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    )
//    /* Other default text styles to override
//    titleLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 22.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp
//    ),
//    labelSmall = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Medium,
//        fontSize = 11.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    )
//    */
//)