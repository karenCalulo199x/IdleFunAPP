package com.kcals.idlefunapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.kcals.idlefunapp.viewmodel.ActivitiesViewModel

@Composable
fun RandomActivities(viewModel: ActivitiesViewModel) {
    val activityVM by viewModel.activitiesLiveData.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchActivities()
    }

    Column {
        if (activityVM?.activity.isNullOrEmpty()) {
            Text(text = "No Data Fetched {${activityVM?.activity}}")
        } else {
            activityVM?.let {
                Text(text = activityVM?.activity.toString())
                Text(text = activityVM?.participants.toString())
                Text(text = activityVM?.price.toString())
                Text(text = activityVM?.link.toString())
                Text(text = activityVM?.key.toString())
            }
        }

    }
}