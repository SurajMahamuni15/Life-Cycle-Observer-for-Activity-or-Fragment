package com.example.lifecycleobserver

import androidx.lifecycle.LifecycleOwner

interface LifeCycleLogger {
    fun registerLifeCycleOwner(owner : LifecycleOwner)
}