package com.hiltandcompose.repository

import com.hiltandcompose.di.networkM.ApiHelper
import com.hiltandcompose.resource.request.LoginRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostsRepository @Inject constructor(val apiHelper: ApiHelper) {
    fun getPosts() = apiHelper.getPosts().flowOn(Dispatchers.IO)

    fun login(loginRequest: LoginRequest) = apiHelper.login(loginRequest).flowOn(Dispatchers.IO)
}