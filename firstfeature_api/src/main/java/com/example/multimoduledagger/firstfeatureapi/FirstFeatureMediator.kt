package com.example.multimoduledagger.firstfeatureapi

import androidx.fragment.app.FragmentManager

interface FirstFeatureMediator {

    fun start(containerId: Int, fragmentManager: FragmentManager)
}
