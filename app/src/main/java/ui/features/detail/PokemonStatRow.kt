package com.uvg.lab4.ui.features.detail

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uvg.lab4.data.model.Stat

@Composable
fun PokemonStatRow(stat: Stat) {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        Text("${stat.name}: ${stat.value}")
        LinearProgressIndicator(
            progress = stat.value / stat.maxValue.toFloat(),
            modifier = Modifier.fillMaxWidth().height(8.dp)
        )
    }
}
