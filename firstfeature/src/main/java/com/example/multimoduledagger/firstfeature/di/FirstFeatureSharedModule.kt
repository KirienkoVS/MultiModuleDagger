package com.example.multimoduledagger.firstfeature.di

import com.example.multimoduledagger.firstfeature.presentation.navigation.FirstFeatureMediatorImpl
import com.example.multimoduledagger.firstfeatureapi.FirstFeatureMediator
import dagger.Binds
import dagger.Module

@Module
interface FirstFeatureSharedModule {

    @Binds
    fun bindFirstFeatureMediator(
        mediator: FirstFeatureMediatorImpl
    ): FirstFeatureMediator
}
