package com.example.multimoduledagger.secondfeature.di

import com.example.multimoduledagger.core.di.FeatureScope
import dagger.Component

@FeatureScope
@Component(
    dependencies = [SecondFeatureComponentDependencies::class]
)
interface SecondFeatureComponent {

    @Component.Factory
    interface Factory {

        fun create(
            dependencies: SecondFeatureComponentDependencies,
        ): SecondFeatureComponent
    }
}
