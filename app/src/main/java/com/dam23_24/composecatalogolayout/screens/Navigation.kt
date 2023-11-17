package com.dam23_24.composecatalogolayout.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.dam23_24.composecatalogolayout.model.Routes.*

@Composable
fun Screen1(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(
            text = "Pantalla 1",
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .clickable {
                    navController.navigate(Pantalla2.route)
                }
        )
    }
}

@Composable
fun Screen2(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Text(text = "Pantalla 2",
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.Center)
                .clickable {
                    navController.navigate(Pantalla3.route)
                }
        )
    }
}

/**
 * Navegación con argumentos obligatorios
 */
@Composable
fun Screen3(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(
            text = "Pantalla 3", fontSize = 16.sp, modifier = Modifier
                .align(Alignment.Center)
                .clickable {
                    navController.navigate(Pantalla4.createRoute(25))
                }
        )
    }
}

/**
 * Navegación con argumentos opcionales
 */
@Composable
fun Screen4(navController: NavHostController, age: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        Text(
            text = "Tengo $age años... qué más quisiera yo",
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.Center)
                .clickable {
                    navController.navigate(Pantalla5.createRoute("alumnos de 2º DAM"))
                    //navController.navigate("pantalla5")
                }
        )
    }
}

@Composable
fun Screen5(navController: NavHostController, name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        Text(
            text = "Hola, $name",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}