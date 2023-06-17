package com.example.multimoduledagger.di

import com.example.multimoduledagger.core.di.ComponentDependencies
import com.example.multimoduledagger.core.di.ComponentDependenciesKey
import com.example.multimoduledagger.firstfeature.di.FirstFeatureComponentDependencies
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ComponentDependenciesModule {

    @Binds
    @IntoMap
    @ComponentDependenciesKey(FirstFeatureComponentDependencies::class)
    abstract fun provideFirstFeatureComponentDependencies(component: AppComponent): ComponentDependencies
}
