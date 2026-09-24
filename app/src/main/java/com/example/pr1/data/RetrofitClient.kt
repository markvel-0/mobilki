package com.example.pr1.data

import com.example.pr1.data.service.ProductService
import com.example.pr1.data.service.UserService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.net.InetSocketAddress
import java.net.Proxy

object RetrofitClient {

    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    val proxy = Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))
    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .proxy(proxy)
        .build()

     val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
         .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val userService: UserService = retrofit.create(UserService::class.java)
    val productService: ProductService = retrofit.create(ProductService::class.java)
}