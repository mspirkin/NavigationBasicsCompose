package com.avtocontrol.navigationbasicscompose.navigation

sealed class ScreenNavigation(val route: String) {
    object Home: ScreenNavigation(route = "home_screen")
    object Detail: ScreenNavigation(route = "detail_screen")
}
