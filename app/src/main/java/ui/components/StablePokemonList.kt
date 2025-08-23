package com.uvg.lab4.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*

@Composable
fun StablePokemonList(pokemons: List<String>) {
    val randomColor by remember {
        mutableStateOf(String.format("#%06x", (0..0xFFFFFF).random()))
    }
    SideEffect {
        println("Composing StablePokemonList with color $randomColor")
    }
    Button(onClick = { }) {
        Text(text = "Hay ${pokemons.size} Pokémon favoritos")
    }
}
