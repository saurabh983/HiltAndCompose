package com.hiltandcompose.di.networkM

import com.hiltandcompose.PostResponse
import retrofit2.Response

interface ApiService {
    suspend fun getPosts(): Response<List<PostResponse>>
}