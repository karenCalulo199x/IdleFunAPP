package com.kcals.idlefunapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kcals.idlefunapp.data.APIRepository
import com.kcals.idlefunapp.model.ActivityModel
import kotlinx.coroutines.launch

class ActivitiesViewModel: ViewModel() {
    private val repository = APIRepository()

    private val _activities = MutableLiveData<ActivityModel>()
    val activitiesLiveData: LiveData<ActivityModel> = _activities

    fun fetchActivities() {
        viewModelScope.launch {
            try {
                val response = repository.getActivities()
                _activities.value = response
            } catch (e: Exception) {
                Log.e("ActivitiesViewModel", "fetchActivities Exception $e")
            }
        }
    }

}