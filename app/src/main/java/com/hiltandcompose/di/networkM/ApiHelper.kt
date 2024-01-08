package com.hiltandcompose.di.networkM

import com.hiltandcompose.PostResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface ApiHelper {
    fun getPosts() : Flow<List<PostResponse>>
}