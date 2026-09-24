package com.example.pr1.data.service

import com.example.pr1.data.model.user.UserResponse
import retrofit2.http.GET

interface UserService {
    @GET("users")
    suspend fun getUsers(): UserResponse
}