package com.hiltandcompose.di.networkM

import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(val apiService: ApiService): ApiHelper{

    override fun getPosts() = flow {
        emit(apiService.getPosts())
    }
}