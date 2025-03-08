package com.example.workclass.screens

import android.app.AlertDialog
import androidx.compose.material3.CircularProgressIndicator
import android.content.ClipData.Item
import android.renderscript.ScriptGroup.Input
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.workclass.data.model.MenuModel
import com.example.workclass.data.model.PostCardModel
import com.example.workclass.ui.theme.components.PostCardComponent
import kotlinx.coroutines.launch

@Composable
fun ComponentScreen(navController: NavHostController){
    //Buttons() //Function to display different types of buttons
    //FloatingButtons() //Function to display floating action buttons
    //Progress() //Function to show progress indicators
    //Chips() //Function to display chip components
    //Sliders() //Function to display chip components
    //Switches() //Function to display switches and checkboxes
    //Badges()
    //SnackBars()
    //AlertDialogs()

    var option by rememberSaveable { mutableStateOf("") }
    var drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text("Menú",modifier = Modifier.padding(16.dp))
                HorizontalDivider()
                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item") },
                    label = {Text("First menú item")},
                    selected = false,
                    onClick = {
                        option = "Buttons"
                        scope.launch{
                            drawerState.apply {
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.Notifications,contentDescription = "item")},
                    label = {Text("Second menú item")},
                    selected = false,
                    onClick = {
                        option = "FloatingButtons"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item")},
                    label = {Text("Third menú item")},
                    selected = false,
                    onClick = {
                        option = "Progress"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item")},
                    label = {Text("Fourth menú item")},
                    selected = false,
                    onClick = {
                        option = "Chips"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item")},
                    label = {Text("Fifth menú item")},
                    selected = false,
                    onClick = {
                        option = "Sliders"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item")},
                    label = {Text("Sixth menú item")},
                    selected = false,
                    onClick = {
                        option = "Switches"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item")},
                    label = {Text("Seventh menú item")},
                    selected = false,
                    onClick = {
                        option = "Badges"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item")},
                    label = {Text("Eight menú item")},
                    selected = false,
                    onClick = {
                        option = "SnackBars"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

                NavigationDrawerItem(
                    icon = {Icon(Icons.Filled.ShoppingCart, contentDescription = "item")},
                    label = {Text("Nine menú item")},
                    selected = false,
                    onClick = {
                        option = "AlertDialogs"
                        scope.launch{
                            drawerState.apply{
                                close()
                            }
                        }
                    }
                )

            }
        }
    ) {
        Column {
            when(option){
                "Buttons"->{
                    Buttons()
                }
                "FloatingButtons"->{
                    FloatingButtons()
                }
                "Progress"->{
                    Progress()
                }
                "Chips"->{
                    Chips()
                }
                "Sliders"->{
                    Sliders()
                }
                "Switches"->{
                    Switches()
                }
                "Badges"->{
                    Badges()
                }
                "SnackBars"->{
                    SnackBars()
                }
                "AlertDialogs"->{
                    AlertDialogs()
                }
            }
        }
    }
}

@Composable
fun Buttons(){
   //This function displays various types of Material Design buttons.
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Button(onClick = {}) {
            //Standard filled button
            Text("Filled") //Botón estandar relleno
        }
        FilledTonalButton(onClick = {}) {
            Text("Tonal") //Botón con relleno tonal
        }
        OutlinedButton(onClick = {}) {
            Text("Outlined") //Boton con borde contorneado
        }
        ElevatedButton(onClick = {}) {
            Text("Elevated") //Boton con efecto de elevacion
        }
        TextButton(onClick = {}) {
            Text("Text") //Botón solo con texto (sin borde ni relleno)
        }
    }
}

@Composable
fun FloatingButtons(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        FloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add,"Add button")
        }
        SmallFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add,"Add button")
        }
        LargeFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add,"Add button")
        }
        ExtendedFloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add,"Add button")
        }
    }
}

@Composable
fun Progress(){
    //This function displays progress indicators
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        LinearProgressIndicator(
            modifier = Modifier.fillMaxWidth()
        )
        CircularProgressIndicator(
            modifier = Modifier.width(64.dp)
        )
    }
}

@Composable
fun Chips(){
    //This function displays different types of chip components
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        AssistChip(
            onClick = {},
            label = {Text("Assist Chip")},
            leadingIcon = {
                Icon(Icons.Filled.AccountBox, contentDescription = "Assist Chip",
                    modifier = Modifier.size(AssistChipDefaults.IconSize))
            }
        )
        var selected by remember{ mutableStateOf(false) }
        FilterChip(
            selected = selected,
            onClick = {selected = !selected},
            label = {Text("Filter Chip")},
            leadingIcon = if(selected){
                {
                    Icon(Icons.Filled.AccountBox, contentDescription = "Assist chip",
                    modifier = Modifier.size(AssistChipDefaults.IconSize))
                }
                }else{
                    null
                }
                )
        InputChipExample("Dismiss",{})
    }
}

@Composable
fun InputChipExample(
    text: String,
    onDismiss: () -> Unit
){
   //This function defines an input chip with a dismiss action
    var enabled by remember{ mutableStateOf(true) }
    if(!enabled) return InputChip(
        label = {Text(text)},
        selected = enabled,
        onClick = {
            onDismiss()
            enabled = !enabled
        },
        avatar={
            Icon(Icons.Filled.Person, contentDescription = "Icon Person", Modifier.size(InputChipDefaults.AvatarSize))
        },
        trailingIcon = {
            Icon(Icons.Filled.Close, contentDescription = "Close Icon",Modifier.size(InputChipDefaults.AvatarSize))
        }
    )
}

@Composable
fun Sliders(){
    //This function displays a slider for selecting a value.
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        var SliderPosition by remember{ mutableStateOf(50f) }
        Slider(
            value = SliderPosition,
            onValueChange = {SliderPosition = it},
            steps = 10,
            valueRange = 0f .. 100f
        )
        Text(
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            text = SliderPosition.toString()
        )
    }
}

@Composable
fun Switches(){
    //This function displays switches and checkboxes
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        var checked by remember{ mutableStateOf(true) }
        Switch(
            checked = checked,
            onCheckedChange = {checked = it}
        )
        var checked2 by remember{ mutableStateOf(true) }
        Switch(
            checked = checked2,
            onCheckedChange = {checked2 = it},
            thumbContent = if(checked2){
                {
                    Icon(Icons.Filled.Check, contentDescription = "Switch check")
                    Modifier.size(InputChipDefaults.AvatarSize)
                }
            }else null
        )
        var checked3 by remember{ mutableStateOf(true)}
        Checkbox(
            checked = checked3,
            onCheckedChange = {checked3 = it}
        )
    }
}

@Composable
fun Badges(){
    //This function displays badges
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        var itemCount by remember { mutableStateOf(0) }
        BadgedBox(
            badge = {
                if(itemCount>0){
                    Badge(
                        contentColor = Color.White,
                        containerColor = Color.Red
                    ){
                        Text(itemCount.toString())
                    }
                }
            }
        ){
            Icon(
                imageVector = Icons.Filled.ShoppingCart, contentDescription = "shopping car icon"
            )
        }
        Button(onClick = {itemCount++}) {
                Text("Add item")
        }
    }
}

@Composable
fun SnackBars(){
    //This function displays SnackBars
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){
        val snackState = remember{SnackbarHostState()}
        val snackScope = rememberCoroutineScope()
        SnackbarHost(hostState = snackState)
        fun launchSnackBar(){
            snackScope.launch { snackState.showSnackbar("The message has been send") }
        }
        Button(::launchSnackBar){
            Text("Send message")
        }
    }
}

@Composable
fun AlertDialogs(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        var showAlertDialog by remember{ mutableStateOf(false) }
        var selectedOption by remember { mutableStateOf("") }
        if(showAlertDialog){
            AlertDialog(
                icon = {Icon(Icons.Filled.Warning, contentDescription = "Icon Warning")},
                title = {Text(text = "Confirm Deletion")},
                text = {Text(text="Are you sure you want to delete this file")},
                onDismissRequest = {},
                confirmButton = {
                    TextButton(
                        onClick = {
                            selectedOption = "Confirm"
                            showAlertDialog = false
                        }
                    ) {
                        Text(text = "Yes")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            selectedOption = "Cancelado"
                            showAlertDialog = false
                        }
                    ) {
                        Text(text="No")
                    }
                }
              )
            }
        Button(onClick = {showAlertDialog=true}) {
            Text(text = "Borrar Archivo")
        }
        Text(selectedOption)
    }
}




