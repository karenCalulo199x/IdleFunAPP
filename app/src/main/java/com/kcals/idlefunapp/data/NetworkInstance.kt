package com.kcals.idlefunapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkInstance {
    private const val BASE_URL = "https://www.boredapi.com/api/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: APIService by lazy {
        retrofit.create(APIService::class.java)
    }
}