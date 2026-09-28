package com.example.pr1.data.service

import com.example.pr1.data.model.user.User
import com.example.pr1.data.model.user.UserResponse
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {
    @GET("users")
    suspend fun getUsers(): UserResponse

    @DELETE("users/{id}")
    suspend fun deletedUser(@Path("id") id: Int): User
}