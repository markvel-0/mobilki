package com.example.pr1.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class SwaggerRequests: ViewModel(){
    fun login(){
        viewModelScope.launch {
            try {

            }
            catch (e: Exception) {
                Log.e("Error: ", "${e.message}")

            }
        }
    }
}
