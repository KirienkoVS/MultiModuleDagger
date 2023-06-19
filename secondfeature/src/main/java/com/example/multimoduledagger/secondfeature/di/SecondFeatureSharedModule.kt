package com.example.multimoduledagger.secondfeature.di

import com.example.multimoduledagger.core.di.MediatorKey
import com.example.multimoduledagger.secondfeature.presentation.navigation.SecondFeatureMediatorImpl
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface SecondFeatureSharedModule {

    @Binds
    @IntoMap
    @MediatorKey(SecondFeatureMediator::class)
    fun bindSecondFeatureMediator(
        mediator: SecondFeatureMediatorImpl,
    ): SecondFeatureMediator
}
