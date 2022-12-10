package com.akscorp.navigation.di

import com.akscorp.core.di.FeatureScope
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.Component

@Component(
    modules = [CiceroneModule::class]
)
@FeatureScope
interface CiceroneNavigationComponent: CiceroneNavigationComponentApi

interface CiceroneNavigationComponentApi {

    fun router(): Router

    fun navigatorHolder(): NavigatorHolder
}
