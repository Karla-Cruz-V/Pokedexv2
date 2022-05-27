package com.example.proyfin1.data

data class ListaPokemons(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Result>
)