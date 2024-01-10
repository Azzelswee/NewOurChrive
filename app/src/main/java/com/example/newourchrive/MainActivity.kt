package com.example.newourchrive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.newourchrive.screens.quiz.QuizCard
import com.example.newourchrive.ui.theme.NewOurChriveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//
            NewOurChriveTheme(
                dynamicColor = true
            ) {
                OurChriveApp()
//                QuizCard()
            }

        }
    }
}


