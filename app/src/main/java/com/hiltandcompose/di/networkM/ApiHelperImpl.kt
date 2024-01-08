package com.hiltandcompose.di.networkM

import javax.inject.Inject

class ApiHelperImpl @Inject constructor(val apiService: ApiService): ApiHelper{

    override suspend fun getPosts() = apiService.getPosts()
}