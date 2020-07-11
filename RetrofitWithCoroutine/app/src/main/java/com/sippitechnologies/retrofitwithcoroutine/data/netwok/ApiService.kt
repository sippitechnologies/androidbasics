package com.sippitechnologies.retrofitwithcoroutine.data.netwok

import com.sippitechnologies.retrofitwithcoroutine.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}