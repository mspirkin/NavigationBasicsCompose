package com.avtocontrol.navigationbasicscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.avtocontrol.navigationbasicscompose.navigation.SetupNavGraph
import com.avtocontrol.navigationbasicscompose.ui.theme.NavigationBasicsComposeTheme

class MainActivity : ComponentActivity() {
    private lateinit var navcontroller: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationBasicsComposeTheme {
                navcontroller = rememberNavController()
                SetupNavGraph(navController = navcontroller)

            }
        }
    }
}


