package com.example.multimoduledagger.firstfeature.di

import com.example.multimoduledagger.core.di.ComponentDependenciesProvider
import com.example.multimoduledagger.core.di.MediatorDependencies
import com.example.multimoduledagger.core.di.MediatorKey
import com.example.multimoduledagger.firstfeature.presentation.navigation.FirstFeatureMediatorImpl
import com.example.multimoduledagger.firstfeatureapi.FirstFeatureMediator
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class FirstFeatureModule {

    @Provides
    fun bindSecondFeatureMediator(
        dependencies: ComponentDependenciesProvider,
    ): SecondFeatureMediator {
        return dependencies.mediators[SecondFeatureMediator::class.java] as SecondFeatureMediator
    }
}
