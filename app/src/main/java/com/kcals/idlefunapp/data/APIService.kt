package com.kcals.idlefunapp.data

import com.kcals.idlefunapp.model.ActivityModel
import retrofit2.http.GET

interface APIService {
    @GET("activity")
    suspend fun getActivities(): ActivityModel
}