package com.example.pr1.data.model.user

data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val email: String,
    val birthDate: String,
    val isDeleted: Boolean = false
)
