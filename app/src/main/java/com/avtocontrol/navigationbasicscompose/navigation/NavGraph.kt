package com.avtocontrol.navigationbasicscompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.avtocontrol.navigationbasicscompose.ui.screens.DetailScreen
import com.avtocontrol.navigationbasicscompose.ui.screens.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController ) {
    NavHost(
        navController = navController,
        startDestination = ScreenNavigation.Home.route
    ) {
        composable(ScreenNavigation.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(ScreenNavigation.Detail.route) {
            DetailScreen(navController = navController)

        }
    }
}