package com.example.workclass.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.*
import androidx.navigation.NavHostController
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.workclass.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.sp

@Composable
fun ModelScreen(navController: NavHostController){
    TopContent()
}

//@Preview(showBackground = true)
@Composable
fun TopContent(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Cyan)
            .height(100.dp)
    ){
        Row() {
            Column() {
                Image(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    painter = painterResource(R.drawable.casco),
                    contentDescription = "Logo",
                    contentScale = ContentScale.Crop
                )
            }
            Column() {
                Text(
                    modifier = Modifier.padding(5.dp),
                    text = "¡Hola, ALONSO!",
                    color = Color.White,
                    fontSize = 20.sp
                )
            }
        }
    }
}