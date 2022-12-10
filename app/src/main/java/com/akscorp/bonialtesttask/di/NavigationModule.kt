package com.akscorp.bonialtesttask.di

import com.akscorp.screenB.navigation.ScreenBCoordinator
import com.akscorp.bonialtesttask.navigation.coordinators.ScreenACoordinatorImpl
import com.akscorp.bonialtesttask.navigation.coordinators.ScreenBCoordinatorImpl
import com.akscorp.screenA.navigation.ScreenACoordinator
import dagger.Binds
import dagger.Module

@Module
interface NavigationModule {

    @Binds
    fun screenACoordinator(impl: ScreenACoordinatorImpl): ScreenACoordinator

    @Binds
    fun screenBCoordinator(impl: ScreenBCoordinatorImpl): ScreenBCoordinator
}