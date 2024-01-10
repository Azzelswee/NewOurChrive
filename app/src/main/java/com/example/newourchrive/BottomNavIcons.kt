package com.example.newourchrive



import android.graphics.drawable.Icon
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.newourchrive.navigation.DashboardMain

data class BottomNavIcons(
    val title: String,
    val icon: ImageVector,
    val route: String,
    var isSelected: Boolean = false
)

val bottomNavIcons = listOf(
    BottomNavIcons("Home", Icons.Rounded.Home, DashboardMain.HOME.name),
    BottomNavIcons("Profile", Icons.Rounded.Person, DashboardMain.PROFILE.name),
    BottomNavIcons("Settings", Icons.Rounded.Settings, DashboardMain.SETTINGS.name)
)

