package com.example.jctestapp.navigation

/** Kind of a enum, but with steroids. Allows us to have multiple classes inside another  **/
sealed class AppScreens(val route: String) {
    object FirstScreen: AppScreens("first_screen")
    object SecondScreen: AppScreens("second_screen")
}
