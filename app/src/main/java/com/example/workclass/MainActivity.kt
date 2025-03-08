package com.example.workclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.workclass.screens.ComponentScreen
import com.example.workclass.screens.MainMenuScreen
import com.example.workclass.screens.HomeScreen
import com.example.workclass.screens.ModelScreen
import com.example.workclass.screens.TestScreen
import com.example.workclass.ui.theme.WorkClassTheme
import org.intellij.lang.annotations.JdkConstants.FontStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkClassTheme {
                ComposableMultiScreenApp()
            }
        }
    }
}



    @Preview(showBackground = true)
    @Composable
    fun TextComposable(name: String = "Empty") {
        Text("Welcome")
        Text(name)
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample1() {
        Column(
            modifier = Modifier
                .padding(24.dp, 10.dp, 20.dp, 10.dp)
        ) {
            Text("Hello world")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample2() {
        Column(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .clickable(onClick = { clickAction() })
        ) {
            Text("Hello world")
        }
    }

    fun clickAction() {
        println("Column Clicked")
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample3() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.Blue)
                .border(width = 5.dp, color = Color.Gray)
                .width(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TextComposable()
            TextComposable()
            TextComposable()
            TextComposable()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample4() {
        Box(
            modifier = Modifier
                .padding(15.dp)
                .height(300.dp)
                .width(300.dp)
        ) {

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun CustomText() {
        Column() {
            Text(
                stringResource(R.string.sample_text),
                color = colorResource(R.color.purple_200),
                fontSize = 20.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold
            )
            val gradientColors = listOf(Color.Cyan, Color.Green, Color.Magenta)
            Text(
                stringResource(R.string.sample_text),
                style = TextStyle(brush = Brush.linearGradient(colors = gradientColors))
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun picture() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(300.dp)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                painter = painterResource(R.drawable.logoandroid),
                contentDescription = "Logo Android",
                contentScale = ContentScale.FillHeight
            )
            @Composable
            fun SetupNavGraph(navController: NavHostController) {
                NavHost(navController = navController, startDestination = "home screen") {
                    composable("main menu") { MainMenuScreen(navController) }
                    composable("home screen") { HomeScreen(navController) }
                    composable("test screen") { TestScreen(navController) }
                }
            }

        }
    }

        @Composable
        fun ComposableMultiScreenApp() {
            val navController = rememberNavController()
            SetupNavGraph(navController = navController)
        }

        @Composable
        fun SetupNavGraph(navController: NavHostController) {
            NavHost(navController = navController, startDestination = "main menu") {
                composable("main menu") { MainMenuScreen(navController) }
                composable("home screen") { HomeScreen(navController) }
                composable("test screen") { TestScreen(navController) }
                composable("model screen"){ ModelScreen(navController) }
                composable("component screen") { ComponentScreen(navController) }
            }
        }

