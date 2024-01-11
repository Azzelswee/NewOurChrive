package com.example.newourchrive

import com.example.newourchrive.listOfQuestions.questionsCySec
import com.example.newourchrive.listOfQuestions.questionsDAA
import com.example.newourchrive.screens.quiz.question.Question

data class CourseCodes(
    val code: String,
    val name: String
)

val coursesComSci = listOf(
    CourseCodes("DAA","Design and Analysis of Algorithms"),
    CourseCodes( "CySec","Cyber Security"),
    CourseCodes( "Prog","Programming"),
    CourseCodes( "DSA","Data Structure and Algorithms"),
    CourseCodes( "WebDev","Web Development"),
    CourseCodes( "NetSec","Network and Security"),
    CourseCodes( "DBMS","Database Management Systems"),
    CourseCodes( "ML","Machine Learning"),
    CourseCodes( "SE","Software Engineering")
)

val coursesRobotics = listOf(
    CourseCodes( "AI","Artificial Intelligence"),
    CourseCodes( "A","Arduino"),
    CourseCodes( "RF","Robotics Fundamentals"),
    CourseCodes( "CV","Computer Vision"),
    CourseCodes( "CMP","Control and Motion Planning"),
    CourseCodes( "LM","Localization and Mapping"),
    CourseCodes( "HRI","Human Robot Interaction"),
    CourseCodes( "RA","Robot Applications"),
    CourseCodes( "RT","Robotics Trends")
)

val coursesElectricity = listOf(
    CourseCodes("CRT", "Circuit"),
    CourseCodes("S", "Safety"),
    CourseCodes("PG", "Power and Generation"),
    CourseCodes("RE", "Renewable Energy"),
    CourseCodes("M", "Measurement"),
    CourseCodes("CRTL", "Control"),
    CourseCodes("PE", "Power Electronics"),
    CourseCodes("ET", "Emerging Technologies"),
    CourseCodes("DSPPS", "DSP Power System"),
)

val coursesElectronics = listOf(
    CourseCodes("AE", "Analog Electronics"),
    CourseCodes("DE", "Digital Electronics"),
    CourseCodes("SCD", "Semiconductor Devices"),
    CourseCodes("DSPE", "DSP Electronics"),
    CourseCodes("CS", "Communication Systems"),
    CourseCodes("MR", "Microwave Radar"),
    CourseCodes("ES", "Embedded Systems"),
    CourseCodes("AI", "AI Electronics"),
    CourseCodes("QC", "Quantum Computing"),
)