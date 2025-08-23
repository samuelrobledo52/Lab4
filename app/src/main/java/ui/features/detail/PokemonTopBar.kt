package com.uvg.lab4.ui.features.detail

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.FavoriteBorder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonTopBar(name: String, onBack: () -> Unit, onFavorite: () -> Unit) {
    CenterAlignedTopAppBar(
        title = { Text(name) },
        navigationIcon = {
            IconButton(onClick = onBack) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Atrás"
                )
            }
        },
        actions = {
            IconButton(onClick = onFavorite) {
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "Favorito"
                )
            }
        }
    )
}

