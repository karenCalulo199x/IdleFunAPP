package com.kcals.idlefunapp.model

data class ActivityModel(
    val activity: String,
    val type: String,
    val participants: Long,
    val price: Double,
    val link: String,
    val key: String,
    val accessibility: Double
)
