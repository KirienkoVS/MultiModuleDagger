package com.example.multimoduledagger.firstfeature.di

import com.example.multimoduledagger.core.di.ComponentDependencies
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator

interface FirstFeatureComponentDependencies : ComponentDependencies {

    fun provideSecondFeatureMediator(): SecondFeatureMediator
}
