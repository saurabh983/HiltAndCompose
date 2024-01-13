package com.hiltandcompose.di.networkM

import com.hiltandcompose.PostResponse
import com.hiltandcompose.resource.request.LoginRequest
import com.hiltandcompose.resource.response.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<PostResponse>

    @POST("auth")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse
}