package com.hiltandcompose

import androidx.lifecycle.ViewModel
import com.hiltandcompose.repository.PostsRepository
import com.hiltandcompose.resource.request.LoginRequest
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PostsViewModel @Inject constructor(private val postsRepository: PostsRepository): ViewModel() {

    fun getPosts() = postsRepository.getPosts()

    fun login(loginRequest: LoginRequest) = postsRepository.login(loginRequest)

}