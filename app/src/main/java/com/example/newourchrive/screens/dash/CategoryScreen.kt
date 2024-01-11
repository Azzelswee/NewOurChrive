package com.example.newourchrive.screens.dash

import android.annotation.SuppressLint
import android.window.BackEvent
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navOptions
import com.example.newourchrive.CategoryButtons
import com.example.newourchrive.CourseListScreen
import com.example.newourchrive.bottomNavIcons
import com.example.newourchrive.navigation.DashboardCategory
import com.example.newourchrive.navigation.DashboardMain
import com.example.newourchrive.navigation.MainScreens
import com.example.newourchrive.ui.theme.RedOrange

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "RememberReturnType")
@Composable
fun DashboardScreen(
    navController: NavController
){
    Icon(imageVector = Icons.Rounded.Home, contentDescription = "")

    val dashNavController: NavHostController = rememberNavController()
    var selectedItem by rememberSaveable {
        mutableStateOf(0)
    }

    BackHandler {
        selectedItem = 0
        dashNavController.popBackStack()
        dashNavController.navigate(DashboardMain.HOME.name)
        println("${dashNavController.visibleEntries.value} Test2")

    }

    Scaffold (
        bottomBar = {
            NavigationBar {

                bottomNavIcons.forEachIndexed { index, item ->

                    NavigationBarItem(
                        selected = selectedItem == index,
                        onClick =
                        {
                            selectedItem = index

                            dashNavController.popBackStack()
                            dashNavController.navigate(item.route)
                        },
                        icon = {
                            Icon(imageVector = item.icon,
                                contentDescription = item.title,
                                modifier = Modifier.size(
                                    if(selectedItem != index)30.dp else 25.dp)
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            unselectedIconColor = MaterialTheme.colorScheme.primary,
                            indicatorColor = Color.Unspecified,
                            disabledIconColor = RedOrange
                        ),
                        enabled = selectedItem != index
                    )
                }
            }
        }
    ){

        NavHost(navController = dashNavController, startDestination = DashboardMain.HOME.name, modifier = Modifier.padding(it)){

            //HOME
            composable(route = DashboardMain.HOME.name){
                Home(dashNavController = dashNavController)
            }
            // COURSE LIST DASH-CATEGORY
            composable(
                route = DashboardCategory.CourseListScreen.name+"{program}",
                arguments = listOf(navArgument("program"){ type = NavType.StringType })
            ){
                    nbe ->
                nbe.arguments?.getString("program")?.let {
                        program ->
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = program.uppercase(), fontWeight = FontWeight.ExtraBold, fontSize = 20.sp, modifier = Modifier.padding(20.dp))
                        CourseListScreen(navController = navController, program = program)
                    }

                }

            }


            // PROFILE
            composable(route = DashboardMain.PROFILE.name){
                Text(text = "Profile Screen")
            }
            // SETTINGS
            composable(route = DashboardMain.SETTINGS.name){
                Text(text = "Settings Screen")
            }

        }
    }


}


@Composable
fun IconCard(categoryButtons: CategoryButtons, dashNavController: NavController){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = RedOrange
        ),
        modifier = Modifier
            .padding(10.dp)
            .clickable(
                onClick = {
                    dashNavController.navigate(DashboardCategory.CourseListScreen.name + categoryButtons.code)
                }
            ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(painter = painterResource(id = categoryButtons.iconId), contentDescription = categoryButtons.name, modifier = Modifier.size(100.dp))
            Text(text = categoryButtons.name, color = Color.White, fontSize = 2.em)
        }

    }
}


