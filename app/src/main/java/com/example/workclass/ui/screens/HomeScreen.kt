package com.example.workclass.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text

@Composable
fun HomeScreen(navController: NavHostController){
    Column(
        modifier = androidx.compose.ui.Modifier
            .padding(10.dp)
            .fillMaxSize()
    ){
        Text("Home Screen")
        Button(
            onClick = {navController.navigate("MainMenuScreen")}
        ) {
            Text("Return to Main Menu")
        }
    }
}

