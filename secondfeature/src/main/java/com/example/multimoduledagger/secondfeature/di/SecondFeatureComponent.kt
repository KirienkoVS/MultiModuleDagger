package com.example.multimoduledagger.secondfeature.di

import com.example.multimoduledagger.core.di.FeatureScope
import dagger.Component

@FeatureScope
@Component
interface SecondFeatureComponent {

    @Component.Factory
    interface Factory {

        fun create(): SecondFeatureComponent
    }
}
