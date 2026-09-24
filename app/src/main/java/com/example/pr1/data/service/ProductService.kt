package com.example.pr1.data.service

import com.example.pr1.data.model.product.Product
import com.example.pr1.data.model.product.ProductResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ProductService {

    @GET("products")
    suspend fun getProduct(): ProductResponse

    @POST("products/add")
    suspend fun addProduct(@Body product: Product): Product
}