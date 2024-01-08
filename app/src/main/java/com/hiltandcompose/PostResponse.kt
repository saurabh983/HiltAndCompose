package com.hiltandcompose

data class PostResponse(val userId: Int?= null, val id: Int?= null,
    val title: String ?= null,
    val body: String ?= null)
