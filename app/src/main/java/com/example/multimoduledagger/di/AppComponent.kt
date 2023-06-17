package com.example.multimoduledagger.di

import android.content.Context
import com.example.multimoduledagger.App
import com.example.multimoduledagger.MainActivity
import com.example.multimoduledagger.firstfeature.di.FirstFeatureComponentDependencies
import com.example.multimoduledagger.firstfeature.di.FirstFeatureSharedModule
import com.example.multimoduledagger.secondfeature.di.SecondFeatureSharedModule
import com.example.multimoduledagger.secondfeatureapi.SecondFeatureMediator
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ComponentDependenciesModule::class,
    ]
)
interface AppComponent : FirstFeatureComponentDependencies {

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance context: Context,
        ): AppComponent
    }

    fun inject(to: App)

    fun inject(to: MainActivity)
}
