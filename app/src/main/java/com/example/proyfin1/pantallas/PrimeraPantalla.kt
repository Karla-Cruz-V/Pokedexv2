package com.example.proyfin1.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.proyfin1.navegacion.NavegacionPantallas

@Composable

fun PrimeraPantalla(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Pokedex")
        }
    }) {
            Detalle(navController)
    }
}

@Composable

fun Detalle(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text( text = "Primera Pantalla")
        Button(onClick = { navController.navigate(route = NavegacionPantallas.PokemonsPantalla.pantalla)}) {
            Text(text = "Click para ver pokemons")

        }

    }
}

/*En este caso scaffold tienen una inicialización en la cual se modifica la barra superior de titulo y se le pone un título, en el
cuerpo también de este se colocó una columna con un botón en el centro.
 */