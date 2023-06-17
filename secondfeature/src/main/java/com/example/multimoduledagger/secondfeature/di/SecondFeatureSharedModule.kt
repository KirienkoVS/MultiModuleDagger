package com.example.multimoduledagger.secondfeature.di

import com.example.multimoduledagger.secondfeature.presentation.navigation.SecondFeatureMediatorImpl
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator
import dagger.Binds
import dagger.Module

@Module
interface SecondFeatureSharedModule {

    @Binds
    fun bindSecondFeatureMediator(
        mediator: SecondFeatureMediatorImpl,
    ): SecondFeatureMediator
}
