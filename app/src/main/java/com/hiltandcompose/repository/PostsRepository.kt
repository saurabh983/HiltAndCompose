package com.hiltandcompose.repository

import com.hiltandcompose.di.networkM.ApiHelper
import javax.inject.Inject

class PostsRepository @Inject constructor(val apiHelper: ApiHelper) {
    suspend fun getPosts() = apiHelper.getPosts()
}