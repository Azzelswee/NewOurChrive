package com.example.newourchrive

import androidx.compose.animation.core.tween
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
            MainScreens.READY.name+"{course}",
            arguments = listOf(navArgument("course"){ type = NavType.StringType}),
            exitTransition = {
                fadeOut()
            }
        ){
            it.arguments?.getString("course")?.let {
                course -> Bounce(navController = navController, course = course)
            }

        }
        // QUIZ MAIN-NAV
        composable(
            MainScreens.QUIZ.name+"{course}",
            arguments = listOf(navArgument("course"){ type = NavType.StringType}),
            enterTransition = {
                slideInVertically(
                    animationSpec = tween(500, 500)
                )
            }
        ){
//            it.arguments?.getString("course")?.let {
//                course -> QuizScreen(navController = navController, course = course)
//            }
            it.arguments?.getString("course")?.let {
                course -> QuizCard(navController,course)
            }

        }



    }
}

// DASH -> COURSE LIST -> BOUNCE -> QUIZ -> RESULT