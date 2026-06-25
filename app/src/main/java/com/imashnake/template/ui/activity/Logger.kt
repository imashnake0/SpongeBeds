package com.imashnake.template.ui.activity

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

private const val TAG = "LifecycleLogger"

class Logger(private val name: String) : LifecycleEventObserver {
    override fun onStateChanged(
        source: LifecycleOwner,
        event: Lifecycle.Event
    ) {
        Log.d(TAG, "$name: $event")
    }
}
