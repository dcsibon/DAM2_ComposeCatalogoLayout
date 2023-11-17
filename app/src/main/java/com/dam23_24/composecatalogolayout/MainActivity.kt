@file:Suppress("SpellCheckingInspection")

package com.dam23_24.composecatalogolayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dam23_24.composecatalogolayout.model.Routes
import com.dam23_24.composecatalogolayout.screens.Screen1
import com.dam23_24.composecatalogolayout.screens.Screen2
import com.dam23_24.composecatalogolayout.screens.Screen3
import com.dam23_24.composecatalogolayout.screens.Screen4
import com.dam23_24.composecatalogolayout.screens.Screen5

import com.dam23_24.composecatalogolayout.ui.theme.ComposeCatalogoLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCatalogoLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Routes.Pantalla1.route) {
                        composable("pantalla1") { Screen1(navController) }
                        composable("pantalla2") { Screen2(navController) }
                        composable("pantalla3") { Screen3(navController) }
                        //composable(Routes.Pantalla1.route) { Screen1(navController) }
                        //composable(Routes.Pantalla2.route) { Screen2(navController) }
                        //composable(Routes.Pantalla3.route) { Screen3(navController) }
                        /*
                        composable(Routes.Pantalla4.route,
                            arguments = listOf(navArgument("age") {type = NavType.IntType})
                        ) { backStackEntry ->
                            Screen4(navController,
                                backStackEntry.arguments?.getInt("age") ?: 0 ) }
                        composable(Routes.Pantalla5.route,
                            arguments = listOf(navArgument("name") { defaultValue = "" })
                        ) { backStackEntry ->
                            Screen5(navController,
                                backStackEntry.arguments?.getString("name").orEmpty() ) }
                        */
                    }

                    //SimpleRecyclerView()
                    //MyScreenDialog()
                    //MyStateExample()
                }
            }
        }
    }
}

