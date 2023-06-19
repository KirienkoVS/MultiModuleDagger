package com.example.multimoduledagger.secondfeature.di

import com.example.multimoduledagger.core.di.MediatorDependencies
import com.example.multimoduledagger.firstfeatureapi.FirstFeatureMediator

interface SecondFeatureComponentDependencies : MediatorDependencies {

    fun provideFirstFeatureMediator(): FirstFeatureMediator
}
