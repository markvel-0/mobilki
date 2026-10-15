package com.example.pr1.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1.MainApplication
import com.example.pr1.data.RetrofitClient
import com.example.pr1.data.model.SharedPrefManager
import com.example.pr1.data.model.login.LoginRequest
import kotlinx.coroutines.launch

class LoginViewModel(private val sharedPrefManager: SharedPrefManager= MainApplication().sharedPrefManager,
    private val profileViewModel: ProfileViewModel): ViewModel(){

    fun login(loginRequest: LoginRequest){
        viewModelScope.launch {
            try {
                val authorizedUser = RetrofitClient.userApi.login(loginRequest)
                Log.d("LoginViewModel", authorizedUser.identity.toString())
                authorizedUser.identity?.let {
                    saveToken(it)
                    profileViewModel.getUserProfile()
                }
            }
            catch (e: Exception) {
                Log.e("Error: ", "${e.message}")

            }
        }
    }
}
