package com.example.pr1.data.service

import com.example.pr1.data.model.UserResponse
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): UserResponse
}