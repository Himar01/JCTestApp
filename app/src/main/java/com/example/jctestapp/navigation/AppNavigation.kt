package com.example.jctestapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jctestapp.screens.FirstScreen
import com.example.jctestapp.screens.SecondScreen

@Composable
fun AppNavigation(){
    /*  It will be spread among all screens. It manages the navigating state between the screens.
        Keeps track of the back stack of composables that make up the screens in your app and the
        state of each screen.
    */
    val navController = rememberNavController()
    /*  The NavHost links the NavController with a navigation graph that specifies the composable
        destinations that should be able to navigate between.
    */
    NavHost(navController, startDestination = AppScreens.FirstScreen.route){
        composable(AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(AppScreens.SecondScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })){

            SecondScreen(navController, it.arguments?.getString("text"))
        }
    }
}