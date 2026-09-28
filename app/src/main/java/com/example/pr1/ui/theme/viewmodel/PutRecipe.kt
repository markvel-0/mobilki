package com.example.pr1.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1.data.RetrofitClient
import com.example.pr1.data.model.recipe.Recipe
import kotlinx.coroutines.launch

class PutRecipe: ViewModel() {

    fun fetch() {
        viewModelScope.launch {
            try {
                val recipe = RetrofitClient.recipeService.getRecipes(26)
                Log.d(
                    "Old Recipe", "ID: ${recipe.id}" +
                            " Название: ${recipe.name}" +
                            " Ингредиенты: ${recipe.ingredients}" +
                            " Сложность: ${recipe.difficulty}" +
                            " Количество калорий: ${recipe.caloriesPerServing}"
                )
                val ingredients= listOf("Стейк или филе лосося", "лимонный сок", "горчица дижонская", "оливковое масло", "мед", "чеснок", "соль", "свежемолотый черный перец")
                val newRecipe = recipe.copy(
                    name = "Запеченный лосось в лимонно-горчичном маринаде",
                    ingredients=ingredients,
                    difficulty = "Легкая",
                    caloriesPerServing = 420
                )
                if(newRecipe.id !=null){
                    val newRecipe = RetrofitClient.recipeService.putRecipes(newRecipe.id,newRecipe)
                    Log.d("New Recipe","ID: ${newRecipe.id}" +
                            " Название: ${newRecipe.name}" +
                            " Ингредиенты: ${newRecipe.ingredients}" +
                            " Сложность: ${newRecipe.difficulty}" +
                            " Количество калорий: ${newRecipe.caloriesPerServing}")
                }
            } catch (e: Exception) {
                Log.e("Error: ", "${e.message}")

            }
        }
    }


}
