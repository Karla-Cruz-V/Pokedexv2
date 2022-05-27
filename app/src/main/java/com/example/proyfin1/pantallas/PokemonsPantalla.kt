package com.example.proyfin1.pantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyfin1.data.ListaPokemons
import com.example.proyfin1.data.Result
import com.example.proyfin1.mvvm.PokemonViewModel

@Composable
fun PokemonsPantalla(navController: NavController){
    val pokemonViewModel : PokemonViewModel = PokemonViewModel()
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack , contentDescription = "Back",
                modifier = Modifier.clickable {
                navController.popBackStack()
            } )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Pokedex List")
        }

    }) {

        Pokemones(pokemons = pokemonViewModel.listaPokemons)
        pokemonViewModel.getPokemons()
    }
}

/*
En este caso scaffold se encarga de colocar un icono en la barra superior y se le agrega un botón para regresar a la pantalla anterior,
y dentro del cuerpo del scaffold se agrega un espaciamiento y posteriormente un texto
 */

@Composable

fun Pokemon(result: Result){
    val expanded = remember { mutableStateOf(false)}
    val extraPadding = if (expanded.value) 48.dp else 0.dp
    Surface(color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp)){

        Row(modifier = Modifier.padding(25.dp)){
           Column (
               Modifier
                   .weight(1f)
                   .padding(bottom = extraPadding)
           ){
               Text(text = "Pokemon: ")
               Text(text = result.name)
           }

            OutlinedButton(onClick = { expanded.value = !expanded.value}) {
                Text(if (expanded.value) "hide" else "catch")

            }
        }

    }

    }

@Composable

private fun Pokemones(pokemons: List<Result>){
    val scrollState = rememberScrollState()

    LazyColumn{

        itemsIndexed(items = pokemons){index, item ->

            Pokemon(result = item)
        }
    }

}

/*
Surface retorna el buffer de lo que se está manejando para el compositor de pantalla
Row como sun nombre lo dice crea una fila en la cual uno puede insertar distintos elementos que se van stackeando de forma horizontal
OutlinedButton crea un boton con el perimetro marcado

6. Por que retorna la lista de todos los pokemones
8. El ViewModelScope se encarga de la cancelación y manejo de las corutinas
12.  Para la creacion de comportamientos en clave morse
 */

