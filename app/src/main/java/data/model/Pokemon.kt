package com.uvg.lab4.data.model

data class Pokemon(
    val id: Int,
    val name: String,
    val types: List<String>,
    val weight: Float,
    val height: Float,
    val stats: List<Stat>
)

data class Stat(
    val name: String,
    val value: Int,
    val maxValue: Int = 255
)


