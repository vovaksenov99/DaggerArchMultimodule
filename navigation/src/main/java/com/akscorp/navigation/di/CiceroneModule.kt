package com.akscorp.navigation.di

import com.akscorp.core.di.FeatureScope
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides

@Module
class CiceroneModule {

    @FeatureScope
    @Provides
    fun cicerone(): Cicerone<Router> = Cicerone.create()

    @FeatureScope
    @Provides
    fun router(cicerone: Cicerone<Router>) = cicerone.router

    @FeatureScope
    @Provides
    fun navigatorHolder(cicerone: Cicerone<Router>) = cicerone.getNavigatorHolder()
}