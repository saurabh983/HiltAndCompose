package com.hiltandcompose.repository

import com.hiltandcompose.di.networkM.ApiHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostsRepository @Inject constructor(val apiHelper: ApiHelper) {
    fun getPosts() = apiHelper.getPosts().flowOn(Dispatchers.IO)
}