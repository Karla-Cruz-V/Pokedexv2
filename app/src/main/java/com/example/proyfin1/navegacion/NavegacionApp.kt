package com.example.proyfin1.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyfin1.pantallas.PokemonsPantalla
import com.example.proyfin1.pantallas.PrimeraPantalla

@Composable
fun NavegacionApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavegacionPantallas.PrimeraPantalla.pantalla){

        composable(route = NavegacionPantallas.PrimeraPantalla.pantalla){

            PrimeraPantalla(navController)
        }
        composable(route = NavegacionPantallas.PokemonsPantalla.pantalla){
            PokemonsPantalla(navController)
        }
    }
}

/*
rememberNavController es un elemento que carga unas APIs muy útiles para el NavHost, sin embargo se
le asigna su valor a navController ya que no es necesario que el usuario sepa ya que solo
es relevante para el NavHost
NavHost es un contenedor de contexto para poder navegar usando NavController
 */