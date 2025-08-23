package com.uvg.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import com.uvg.lab4.data.model.Pokemon
import com.uvg.lab4.data.model.Stat
import com.uvg.lab4.ui.features.detail.DetailScreen
import com.uvg.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab4Theme {
                val sample = Pokemon(
                    id = 25,
                    name = "Pikachu",
                    types = listOf("Electric"),
                    weight = 6.0f,
                    height = 0.4f,
                    stats = listOf(
                        Stat("HP", 35),
                        Stat("Attack", 55),
                        Stat("Speed", 90)
                    )
                )
                DetailScreen(
                    pokemon = sample,
                    onBack = {},
                    onFavorite = {}
                )
            }
        }
    }
}
