package com.example.pr1.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1.data.RetrofitClient
import com.example.pr1.data.model.SharedPrefManager
import kotlinx.coroutines.launch

class ProfileViewModel(private val sharedPrefManager: SharedPrefManager): ViewModel() {
    fun getUserProfile() {
        viewModelScope.launch {
            val token = sharedPrefManager.readTokenFromSharedPrefs()
            if (token != null) {
                try {
                    val user = RetrofitClient.userApi.login("Bearer ${token}")
                    Log.d("LoginViewModel", "User: ${user.identity}")
                }
                catch (e: Exception) {
                    Log.e("Error: ", "${e.message}")

                }


            }
        }
    }
}