package com.example.newourchrive

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.newourchrive.navigation.MainScreens
import com.example.newourchrive.ui.theme.RedOrange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseCard(program: String,course: CourseCodes, navController: NavController){

    Card(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 10.dp)
            .height(100.dp)
            .fillMaxWidth(),
        onClick = {
            navController.navigate(MainScreens.READY.name + "/${course.code}/$program")
        },
        colors = CardDefaults.cardColors(
            containerColor = RedOrange,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = course.name, fontSize = 20.sp, textAlign = TextAlign.Center)
            }



    }
}