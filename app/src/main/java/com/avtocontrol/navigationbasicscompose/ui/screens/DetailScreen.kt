package com.avtocontrol.navigationbasicscompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.avtocontrol.navigationbasicscompose.navigation.ScreenNavigation

@Composable
fun DetailScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(modifier = Modifier.clickable {
             navController.navigate(ScreenNavigation.Home.route){
                 popUpTo(ScreenNavigation.Home.route) {inclusive = true}
             }
        }
            ,text = "Two Screen",
            color = androidx.compose.ui.graphics.Color.Red,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(rememberNavController())
}