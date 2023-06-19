package com.example.multimoduledagger.core.di

import dagger.MapKey
import javax.inject.Scope
import kotlin.reflect.KClass

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FeatureScope

@Target(AnnotationTarget.FUNCTION)
@MapKey
annotation class MediatorKey(val value: KClass<out MediatorDependencies>)
