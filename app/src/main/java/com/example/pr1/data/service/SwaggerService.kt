package com.example.pr1.data.service

import com.example.pr1.data.model.login.LoginRequest
import com.example.pr1.data.model.product.Product
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface SwaggerService {

    @POST("users/auth-with-password")
    suspend fun login(@Body login: LoginRequest): LoginRequest

    @GET("products/records")
    suspend fun getProducts(): Product
}