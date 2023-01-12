package com.example.jctestapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jctestapp.Greeting
import com.example.jctestapp.navigation.AppNavigation
import com.example.jctestapp.navigation.AppScreens
import com.example.jctestapp.ui.theme.JCTestAppTheme


@Composable
fun FirstScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text("FirstScreen")
        }
    }){
        BodyContent(navController)
    }
}


@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola navegación")
        Button( onClick = {
            navController.navigate(AppScreens.SecondScreen.route + "/Este es un parámetro")
        }){
            Text("Navega")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JCTestAppTheme {
        val nav = rememberNavController()
        FirstScreen(navController = nav)
    }
}

