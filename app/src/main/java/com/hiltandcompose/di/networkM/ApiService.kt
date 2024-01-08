package com.hiltandcompose.di.networkM

import com.hiltandcompose.PostResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<PostResponse>
}