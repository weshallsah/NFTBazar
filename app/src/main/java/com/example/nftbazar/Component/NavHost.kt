package com.example.nftbazar.Component

import Homeview
import Splashview
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = NavigationItem.Splash.route,
) {
    NavHost(navController = navController, startDestination) {
        composable(NavigationItem.Splash.route) {
            Splashview(navController);
        }
        composable(NavigationItem.Home.route) {
            Homeview(navController);
        }
    }
}