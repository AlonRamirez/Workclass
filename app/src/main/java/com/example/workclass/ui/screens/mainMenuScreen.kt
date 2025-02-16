package com.example.workclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import java.lang.reflect.Modifier

@Composable
fun MainMenuScreen(navController: NavHostController){
    Column(
        modifier = androidx.compose.ui.Modifier
            .padding(10.dp)
            .fillMaxSize()
    ){
        Text("Main menu")
        Button(
            onClick = { navController.navigate("home screen")}
        ){
            Text("Go to home screen")
        }
        Button(
            onClick = { navController.navigate("test screen")}
        ){
            Text("Go to Test Screen")
        }
    }
}