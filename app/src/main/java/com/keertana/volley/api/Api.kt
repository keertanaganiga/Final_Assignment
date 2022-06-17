package com.keertana.volley.api

import com.keertana.volley.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("users")
    fun getUsers():Call<UserResponse>

}