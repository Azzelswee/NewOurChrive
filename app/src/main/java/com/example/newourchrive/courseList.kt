package com.example.newourchrive

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun CourseListScreen(navController: NavController, program: String){

    var selectedProgram = emptyList<CourseCodes>()
    when(program){
        "Computer Science" -> selectedProgram = coursesComSci
        "Robotics" -> selectedProgram = coursesRobotics
    }
    LazyColumn(){
        items(selectedProgram){
            CourseCard(it,navController = navController)
        }
    }
}