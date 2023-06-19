package com.example.multimoduledagger.firstfeature.di

import com.example.multimoduledagger.core.di.MediatorDependencies
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator

interface FirstFeatureComponentDependencies : MediatorDependencies {

    fun provideSecondFeatureMediator(): SecondFeatureMediator
}
