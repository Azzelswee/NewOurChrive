package com.example.newourchrive

import com.example.newourchrive.listOfQuestions.questionsCySec
import com.example.newourchrive.listOfQuestions.questionsDAA
import com.example.newourchrive.screens.quiz.question.Question

data class CourseCodes(
    val code: String,
    val name: String
)

val coursesComSci = listOf(
    CourseCodes("CSC121", "DAA"),
    CourseCodes("CSC122", "CySec"),
    CourseCodes("CSC123", "Course3"),
    CourseCodes("CSC124", "Course4"),
    CourseCodes("CSC125", "Course5"),
    CourseCodes("CSC126", "Course6"),
    CourseCodes("CSC127", "Course7"),
    CourseCodes("CSC128", "Course8"),
    CourseCodes("CSC129", "Course9")
)

val coursesRobotics = listOf(
    CourseCodes("RBT121", "AI Concepts"),
    CourseCodes("RBT122", "Arduino Concepts"),
    CourseCodes("RBT123", "Course3"),
    CourseCodes("RBT124", "Course4"),
    CourseCodes("RBT125", "Course5"),
    CourseCodes("RBT126", "Course6"),
    CourseCodes("RBT127", "Course7"),
    CourseCodes("RBT128", "Course8"),
    CourseCodes("RBT129", "Course9")
)