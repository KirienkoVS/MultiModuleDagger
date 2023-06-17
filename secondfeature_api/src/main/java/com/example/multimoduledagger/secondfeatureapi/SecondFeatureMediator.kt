package com.example.multimoduledagger.secondfeatureapi

import androidx.fragment.app.FragmentManager

interface SecondFeatureMediator {

    fun start(containerId: Int, fragmentManager: FragmentManager)
}
