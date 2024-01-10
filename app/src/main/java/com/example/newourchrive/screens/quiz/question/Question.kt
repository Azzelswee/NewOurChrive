package com.example.newourchrive.screens.quiz.question

data class Question(
    val questionID: Int,
    val question: String,
    val options: List<String>,
    val correctAnswer: String
)



