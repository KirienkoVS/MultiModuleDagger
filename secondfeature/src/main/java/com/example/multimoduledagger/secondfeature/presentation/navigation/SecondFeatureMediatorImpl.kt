package com.example.multimoduledagger.secondfeature.presentation.navigation

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.example.multimoduledagger.secondfeature.presentation.view.fragment.SecondFeatureFragment
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator
import javax.inject.Inject

class SecondFeatureMediatorImpl @Inject constructor() : SecondFeatureMediator {

    override fun start(containerId: Int, fragmentManager: FragmentManager) {
        val simpleName = SecondFeatureFragment::class.simpleName
        fragmentManager.commit {
            replace(containerId, SecondFeatureFragment::class.java, null, simpleName)
            addToBackStack(simpleName)
        }
    }
}
