package com.example.pr1.dummyjson

import retrofit2.http.GET
import retrofit2.Call
import retrofit2.Response

interface ApiService {
    @GET("users")
    suspend fun getUsers(): userresponce
}