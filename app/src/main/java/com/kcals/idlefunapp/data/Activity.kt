package com.kcals.idlefunapp.data

data class Activity(
    val activity: String,
    val accessibility: String,
    val type: String,
    val participants: Int,
    val price: Float,
    val link: String,
    val key: String,
)
