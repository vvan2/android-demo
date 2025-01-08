package com.example.demo_practice

data class LoginRequest(
    val email: String,
    val password: String
)

data class LoginResponse(
    val accessToken: String,
    val refreshToken: String
)
data class SignUpRequest(
    val name: String,
    val email: String,
    val password: String
)