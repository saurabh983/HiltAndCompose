package com.hiltandcompose.di.networkM

import com.hiltandcompose.PostResponse
import com.hiltandcompose.resource.Resource
import com.hiltandcompose.resource.request.LoginRequest
import com.hiltandcompose.resource.response.LoginResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface ApiHelper {
    fun getPosts() : Flow<Resource<List<PostResponse>>>
    fun login(loginRequest: LoginRequest) : Flow<Resource<LoginResponse>>
}