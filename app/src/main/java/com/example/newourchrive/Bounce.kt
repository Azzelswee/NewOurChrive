package com.example.newourchrive

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.newourchrive.navigation.MainScreens
import com.example.newourchrive.ui.theme.Gold
import com.example.newourchrive.ui.theme.RedOrange
import kotlinx.coroutines.delay

@Composable
fun Bounce(course: String?,navController: NavController,program: String?,totalTime: Int = 5){

    val redOrangeGradient = Brush.linearGradient(colors = listOf(Gold,RedOrange))
    var remainingTime by remember { mutableIntStateOf(totalTime) }
    val infiniteTransition = rememberInfiniteTransition(label = "")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.2f,
        animationSpec = infiniteRepeatable(
            tween(durationMillis = 300, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ), label = ""
    )

    LaunchedEffect(remainingTime) {
        if (remainingTime > 0) {
            delay(1000)
            remainingTime -= 1
        }
        else {
            navController.popBackStack()
            navController.navigate(MainScreens.QUIZ.name + "/$course/$program")
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(redOrangeGradient)
    ) {

        Text(
            text = "$remainingTime",
            style = MaterialTheme.typography.displayLarge,
            fontSize = 100.sp,
            color = Color.White,
            modifier = Modifier
                .scale(scale)
                .drawBehind {
                    drawOval(
                        color = Color.Black,
                        size = Size(width = size.width, 20f),
                        topLeft = Offset(size.width / 50,size.height - 50),
                        alpha = 0.2f
                    )
                }

        )
    }
}

