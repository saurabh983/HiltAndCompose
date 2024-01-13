package com.hiltandcompose.di.networkM

import com.hiltandcompose.resource.Resource
import com.hiltandcompose.resource.request.LoginRequest
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(val apiService: ApiService): ApiHelper{

    override fun getPosts() = flow {
        emit(Resource.Loading())
        try {
            val apiResponse = apiService.getPosts()
            emit(Resource.Success(apiResponse))
        } catch (ex: Exception){
            ex.printStackTrace()
            emit(Resource.Error(ex.localizedMessage))
        }
    }

    override fun login(loginRequest: LoginRequest) = flow {
        emit(Resource.Loading())
        try {
            val apiResponse = apiService.login(loginRequest)
            emit(Resource.Success(apiResponse))
        } catch (ex: Exception){
            ex.printStackTrace()
            emit(Resource.Error(ex.localizedMessage))
        }
    }
}