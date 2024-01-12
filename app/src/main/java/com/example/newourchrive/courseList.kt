package com.example.newourchrive

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
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
        "CS" -> selectedProgram = coursesComSci
        "R" -> selectedProgram = coursesRobotics
        "EY" -> selectedProgram = coursesElectricity
        "ES" -> selectedProgram = coursesElectronics
    }
    LazyColumn(){
        items(selectedProgram){
            CourseCard(program,it,navController = navController)
        }
    }

}