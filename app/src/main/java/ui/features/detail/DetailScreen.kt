package com.uvg.lab4.ui.features.detail

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.uvg.lab4.data.model.Pokemon
import com.uvg.lab4.data.model.Stat

@Composable
fun DetailScreen(pokemon: Pokemon, onBack: () -> Unit, onFavorite: () -> Unit) {
    Scaffold(
        topBar = { PokemonTopBar(name = pokemon.name, onBack = onBack, onFavorite = onFavorite) }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            PokemonMeasurements(weight = pokemon.weight, height = pokemon.height)
            pokemon.stats.forEach { stat ->
                stat.StatBar()
            }
        }
    }
}

@Composable
fun Stat.StatBar() {
    PokemonStatRow(this)
}
