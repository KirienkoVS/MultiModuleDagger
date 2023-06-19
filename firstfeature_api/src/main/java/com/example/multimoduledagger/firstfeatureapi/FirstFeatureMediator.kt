package com.example.multimoduledagger.firstfeatureapi

import androidx.fragment.app.FragmentManager
import com.example.multimoduledagger.core.di.MediatorDependencies

interface FirstFeatureMediator : MediatorDependencies {

    fun start(containerId: Int, fragmentManager: FragmentManager)
}
