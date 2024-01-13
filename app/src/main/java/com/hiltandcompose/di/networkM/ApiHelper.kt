package com.hiltandcompose.di.networkM

import com.hiltandcompose.PostResponse
import com.hiltandcompose.resource.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface ApiHelper {
    fun getPosts() : Flow<Resource<List<PostResponse>>>
}