package com.sippitechnologies.retrofitwithcoroutine.data.netwok

class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}