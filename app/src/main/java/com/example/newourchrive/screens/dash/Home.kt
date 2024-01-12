package com.example.newourchrive.screens.dash

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ExitToApp
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.newourchrive.listOfPrograms.iconList
import com.example.newourchrive.ui.theme.Gold
import com.example.newourchrive.ui.theme.RedOrange

@Composable
fun Home(dashNavController: NavController){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .fillMaxSize()
            .padding(vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = "Quiz Game",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Column(
            modifier = Modifier.padding(vertical = 20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val row1 = iconList.subList(0, iconList.size/2 )

                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    row1.forEach {
                        IconCard(categoryButtons = it, dashNavController = dashNavController)

                }
            }
            val row2 = iconList.subList(iconList.size/2, iconList.size)

                Row(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    row2.forEach {
                    IconCard(categoryButtons = it, dashNavController = dashNavController)
                    println(row1.toString())

                }
            }

        }
        HorizontalDivider(modifier = Modifier.padding(30.dp), thickness = 5.dp, color = Gold)
        Text(text = "Learning Materials", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        val uriHandler = LocalUriHandler.current
        links.forEach { iconLink ->
            Row (
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .height(50.dp)
                    .fillMaxWidth()
                    .clickable {
                        buildAnnotatedString {
                            addStringAnnotation(
                                tag = "URL",
                                annotation = iconLink.link,
                                start = 0,
                                end = 0
                            )
                        }
                            .getStringAnnotations("URL", 0, 0)
                            .firstOrNull()
                            ?.let { stringAnnotation ->
                                uriHandler.openUri(stringAnnotation.item)
                            }
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = iconLink.name, fontSize = 20.sp, textAlign = TextAlign.Center)
                Icon(imageVector = Icons.AutoMirrored.Outlined.ExitToApp,
                    contentDescription = "Link",
                    modifier = Modifier.size(30.dp)
                )

            }
            HorizontalDivider(modifier = Modifier.fillMaxWidth(0.9f), color = RedOrange)
        }
    }
}