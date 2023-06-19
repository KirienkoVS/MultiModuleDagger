package com.example.multimoduledagger.firstfeature.di

import com.example.multimoduledagger.core.di.FeatureScope
import com.example.multimoduledagger.firstfeature.presentation.view.fragment.FirstFeatureFragment
import dagger.Component

@FeatureScope
@Component(
    modules = [FirstFeatureModule::class],
//    dependencies = [FirstFeatureComponentDependencies::class],
)
interface FirstFeatureComponent {

    @Component.Factory
    interface Factory {

        fun create(
//            dependencies: FirstFeatureComponentDependencies,
        ): FirstFeatureComponent
    }

    fun inject(to: FirstFeatureFragment)
}
