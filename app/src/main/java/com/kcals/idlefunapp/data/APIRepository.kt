package com.kcals.idlefunapp.data

import com.kcals.idlefunapp.model.ActivityModel

class APIRepository {
    private val apiService = NetworkInstance.apiService

    suspend fun getActivities(): ActivityModel {
        return apiService.getActivities()
    }
}