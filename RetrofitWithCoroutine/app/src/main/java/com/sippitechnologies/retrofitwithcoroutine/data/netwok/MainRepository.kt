package com.sippitechnologies.retrofitwithcoroutine.data.netwok

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}