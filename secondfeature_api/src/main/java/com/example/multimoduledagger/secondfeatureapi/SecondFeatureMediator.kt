package com.example.multimoduledagger.secondfeatureapi

import androidx.fragment.app.FragmentManager
import com.example.multimoduledagger.core.di.MediatorDependencies

interface SecondFeatureMediator : MediatorDependencies {

    fun start(containerId: Int, fragmentManager: FragmentManager)
}
