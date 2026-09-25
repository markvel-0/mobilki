package com.example.pr1.data.service

import com.example.pr1.data.model.product.ProductResponse
import com.example.pr1.data.model.recipe.Recipe
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface RecipeService {

    @GET("recipes/{id}")
    suspend fun getRecipes(@Path("id") id: Int): Recipe

    @PUT("recipes/{id}")
    suspend fun putRecipes(@Path("id") id: Int, @Body recipe: Recipe): Recipe

}