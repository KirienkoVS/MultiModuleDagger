package com.example.multimoduledagger.di

import com.example.multimoduledagger.core.di.ComponentDependenciesKey
import com.example.multimoduledagger.firstfeature.di.FirstFeatureComponentDependencies
import com.example.multimoduledagger.firstfeature.di.FirstFeatureSharedModule
import com.example.multimoduledagger.secondfeature.di.SecondFeatureSharedModule
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(
    includes = [
        FirstFeatureSharedModule::class,
        SecondFeatureSharedModule::class,
    ]
)
interface AppModule {

}
