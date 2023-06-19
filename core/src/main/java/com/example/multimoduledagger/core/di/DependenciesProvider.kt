package com.example.multimoduledagger.core.di

interface DependenciesProvider

interface ComponentDependenciesProvider {

    val mediators: MediatorsMap
}

typealias MediatorsMap = Map<Class<out MediatorDependencies>, @JvmSuppressWildcards MediatorDependencies>

interface MediatorDependencies
