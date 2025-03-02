package com.example.workclass.screens

import android.os.Bundle
import org.w3c.dom.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.workclass.R

@Composable
fun HomeScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        Content1()
        Content2()
        Content1()
        Content2()
        Content1()
        Content2()
    }
}

@Preview(showBackground = true)
@Composable
fun Content1(){
    Card(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Text(
            modifier = Modifier.padding(10.dp),
            text = "This is a title",
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(R.drawable.logoandroid),
            contentDescription = "Android logo",
            contentScale = ContentScale.Crop
        )
        Text(
            stringResource(R.string.ipsum_text),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(10.dp),
            fontSize = 12.sp,
            lineHeight = 10.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Content2(){
    Card(){
        Row(){
            Column(){
                Image(
                    modifier = Modifier
                        .width(90.dp)
                        .height(90.dp),
                    painter = painterResource(R.drawable.logoandroid),
                    contentDescription = "Android logo",
                    contentScale = ContentScale.Crop
                )
            }
            Column(){
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "This is a title",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                )
                Text(
                    stringResource(R.string.ipsum_text),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(10.dp),
                    fontSize = 10.sp,
                    lineHeight = 10.sp
                )
            }
        }
    }
}