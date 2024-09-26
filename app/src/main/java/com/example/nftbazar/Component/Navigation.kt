package com.example.nftbazar.Component

enum class Screen {
    HOME,
    Splash,
}

sealed class NavigationItem(val route: String) {
    object Home : NavigationItem(Screen.HOME.name)
    object Splash : NavigationItem(Screen.Splash.name)
}