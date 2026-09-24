package com.example.pr1.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1.data.RetrofitClient
import com.example.pr1.data.model.product.Product
import kotlinx.coroutines.launch

class AddProduct: ViewModel(){
    fun fetch(){
        viewModelScope.launch {
            try {
                val productResponse= RetrofitClient.productService.getProduct()
                val products = productResponse.products
                for (product in products){
                    Log.d("AddProductViewModel: ", "Название: ${product.title} \n" +
                            "Описание: ${product.description} \n" +
                            "Категории: ${product.category} \n" +
                            "Теги: ${product.tags}")
                }
            }
            catch (e: Exception){
                Log.e("error: ", "${e.message}", e)
            }
        }
    }

    fun addProduct(product: Product){
        viewModelScope.launch {
            try {
                val product = RetrofitClient.productService.addProduct(product)
                Log.d("AddProductViewModel", "id: ${product.id} Название: ${product.title} \n" +
                        "Описание: ${product.description} \n" +
                        "Категории: ${product.category} \n" +
                        "Теги: ${product.tags}")
            }
            catch (e: Exception){
                Log.e("error: ", "${e.message}", e)
            }
        }
    }
}
