package com.example.proyfin1.navegacion

sealed class NavegacionPantallas(val pantalla : String) {

    object PrimeraPantalla : NavegacionPantallas("primera_pantalla")
    object PokemonsPantalla : NavegacionPantallas("pokemons_pantalla")
}
/*
 Las clases selladas se podría decir que son enumeradores pero cada enumerado puede ser una clase con distintas variables
  y métodos lo cual le agrega mucha flexibilidad al momento de usar este tipo de clase
 */