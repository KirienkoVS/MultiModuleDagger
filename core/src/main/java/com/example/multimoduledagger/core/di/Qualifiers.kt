package com.example.multimoduledagger.core.di

import dagger.MapKey
import javax.inject.Scope
import kotlin.reflect.KClass

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class FeatureScope

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class ComponentDependenciesKey(val value: KClass<out ComponentDependencies>)
