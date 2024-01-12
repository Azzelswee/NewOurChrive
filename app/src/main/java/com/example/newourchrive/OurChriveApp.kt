package com.example.newourchrive

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.newourchrive.navigation.DashboardMain
import com.example.newourchrive.navigation.MainScreens
import com.example.newourchrive.screens.dash.DashboardScreen
import com.example.newourchrive.screens.quiz.QuizCard

//import com.example.newourchrive.screens.quiz.QuizScreen

@Composable
fun OurChriveApp(){

    val navController: NavHostController = rememberNavController()


    NavHost(navController = navController, startDestination = MainScreens.DASHBOARD.name){
        // DASHBOARD
        navigation(startDestination = DashboardMain.HOME.name, route = MainScreens.DASHBOARD.name){
            composable(route = DashboardMain.HOME.name){
                DashboardScreen(navController)
            }

        }
        // BOUNCE MAIN-NAV
        composable(
            MainScreens.READY.name+"/{course}/{program}",
            arguments = listOf(navArgument("course"){ type = NavType.StringType}, navArgument("program"){type = NavType.StringType}),
            exitTransition = {
                fadeOut()
            }
        ){
            val course = it.arguments?.getString("course")
            val program = it.arguments?.getString("program")

            Bounce(course = course, navController = navController, program = program)

        }
        // QUIZ MAIN-NAV
        composable(
            MainScreens.QUIZ.name+"/{course}/{program}",
            arguments = listOf(navArgument("course"){ type = NavType.StringType}, navArgument("program"){type = NavType.StringType}),
            enterTransition = {
                fadeIn()
            }
        ){
//            it.arguments?.getString("course")?.let {
//                course -> QuizScreen(navController = navController, course = course)
//            }
            val course = it.arguments?.getString("course")
            val program = it.arguments?.getString("program")

            QuizCard(course = course, navController = navController, program = program)




        }



    }
}

// DASH -> COURSE LIST -> BOUNCE -> QUIZ -> RESULT