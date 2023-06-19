package com.example.multimoduledagger.di

import android.content.Context
import com.example.multimoduledagger.App
import com.example.multimoduledagger.MainActivity
import com.example.multimoduledagger.core.di.MediatorDependencies
import com.example.multimoduledagger.core.di.MediatorsMap
import com.example.multimoduledagger.firstfeature.di.FirstFeatureComponentDependencies
import com.example.multimoduledagger.firstfeature.di.FirstFeatureSharedModule
import com.example.multimoduledagger.firstfeatureapi.FirstFeatureMediator
import com.example.multimoduledagger.secondfeature.di.SecondFeatureComponentDependencies
import com.example.multimoduledagger.secondfeature.di.SecondFeatureSharedModule
import com.example.multimoduledagger.secondfeature.presentation.navigation.SecondFeatureMediatorImpl
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
//        FirstFeatureSharedModule::class,
//        SecondFeatureSharedModule::class,
        AppModule::class,
    ],
)
interface AppComponent : FirstFeatureComponentDependencies, SecondFeatureComponentDependencies {

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance context: Context,
        ): AppComponent
    }

    fun inject(to: App)

    fun inject(to: MainActivity)
}

@Module
abstract class AppModule {

    @Binds
    abstract fun provideMediatorsMap(component: AppComponent): MediatorDependencies
}
