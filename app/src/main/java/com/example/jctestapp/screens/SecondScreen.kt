package com.example.jctestapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jctestapp.Greeting
import com.example.jctestapp.ui.theme.JCTestAppTheme


@Composable
fun SecondScreen(navController: NavController, text: String?){

    Scaffold(topBar = {
        TopAppBar() {
            Row(){
                Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
                Spacer(modifier = Modifier.width(8.dp))
                Text("SecondScreen")
            }

        }
    }){
        SecondBodyContent(navController, text)
    }
}

@Composable
fun SecondBodyContent(navController: NavController, text: String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("He navegado")
        text?.let{
            Text(it)
        }
        Button( onClick = {
            navController.popBackStack()
        }){
            Text("Volver atrás")
        }
    }
}
