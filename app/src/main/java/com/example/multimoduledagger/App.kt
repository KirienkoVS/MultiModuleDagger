package com.example.multimoduledagger

import android.app.Application
import com.example.multimoduledagger.core.di.ComponentDependenciesProvider
import com.example.multimoduledagger.core.di.HasComponentDependencies
import com.example.multimoduledagger.di.AppComponent
import com.example.multimoduledagger.di.DaggerAppComponent
import javax.inject.Inject

class App : Application(), HasComponentDependencies {

    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .factory()
            .create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}
