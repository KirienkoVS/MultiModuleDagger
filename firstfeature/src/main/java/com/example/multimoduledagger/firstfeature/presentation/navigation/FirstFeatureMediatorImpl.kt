package com.example.multimoduledagger.firstfeature.presentation.navigation

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.example.multimoduledagger.firstfeature.presentation.view.fragment.FirstFeatureFragment
import com.example.multimoduledagger.firstfeatureapi.FirstFeatureMediator
import javax.inject.Inject

class FirstFeatureMediatorImpl @Inject constructor() : FirstFeatureMediator {

    override fun start(containerId: Int, fragmentManager: FragmentManager) {
        val simpleName = FirstFeatureFragment::class.simpleName
        fragmentManager.commit {
            add(containerId, FirstFeatureFragment::class.java, null, simpleName)
            addToBackStack(simpleName)
        }
    }
}
