package com.example.multimoduledagger.firstfeature.di

import com.example.multimoduledagger.core.di.MediatorKey
import com.example.multimoduledagger.firstfeature.presentation.navigation.FirstFeatureMediatorImpl
import com.example.multimoduledagger.firstfeatureapi.FirstFeatureMediator
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface FirstFeatureSharedModule {

    @Binds
    @IntoMap
    @MediatorKey(FirstFeatureMediator::class)
    fun bindFirstFeatureMediator(
        mediator: FirstFeatureMediatorImpl,
    ): FirstFeatureMediator
}
