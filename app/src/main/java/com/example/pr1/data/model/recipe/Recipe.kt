package com.example.pr1.data.model.recipe

data class Recipe(
    val id: Int? = null,
    val name: String,
    val ingredients: List<String>,
    val difficulty: String,
    val caloriesPerServing: Int
)
