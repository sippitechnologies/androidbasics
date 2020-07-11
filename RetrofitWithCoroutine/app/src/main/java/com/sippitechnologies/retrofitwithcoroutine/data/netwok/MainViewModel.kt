package com.sippitechnologies.retrofitwithcoroutine.data.netwok

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.sippitechnologies.retrofitwithcoroutine.data.model.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}