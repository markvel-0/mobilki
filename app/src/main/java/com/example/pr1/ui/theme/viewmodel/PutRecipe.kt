package com.example.pr1.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1.data.RetrofitClient
import com.example.pr1.data.model.recipe.Recipe
import kotlinx.coroutines.launch

class PutRecipe: ViewModel() {

//    var recipeBefore: Recipe?=null
//    var recipeAfter: Recipe?=null
    fun fetch(id: Int) {
        viewModelScope.launch {
            try {
                val recipe = RetrofitClient.recipeService.getRecipes(id)
                Log.d(
                    "Old Recipe", "ID: ${recipe.id}" +
                            " Название: ${recipe.name}" +
                            " Ингредиенты: ${recipe.ingredients}" +
                            " Сложность: ${recipe.difficulty}" +
                            " Количество калорий: ${recipe.caloriesPerServing}"
                )
            } catch (e: Exception) {
                Log.e("Error: ", "${e.message}")

            }
        }
    }
    fun putRecipe(id:Int, recipe: Recipe){
        viewModelScope.launch {
            try{
                val recipe= RetrofitClient.recipeService.putRecipes(id,recipe)
                if(recipe.id !=null){
                    Log.d("New Recipe","ID: ${recipe.id}" +
                            " Название: ${recipe.name}" +
                            " Ингредиенты: ${recipe.ingredients}" +
                            " Сложность: ${recipe.difficulty}" +
                            " Количество калорий: ${recipe.caloriesPerServing}")
                    }
                }
            catch (e: Exception) {
                Log.e("Error: ", "${e.message}")
            }
        }
    }


}
