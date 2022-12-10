package com.akscorp.screenA.di

import com.akscorp.screenA.navigation.ScreenACoordinator
import com.akscorp.screenAApi.TestAScreenData
import retrofit2.Retrofit

/**
 * Here we write all dependencies what we need in out module from outside
 */
interface ExternalScreenADeps {

    fun testAScreenData(): TestAScreenData

    fun screenACoordinator(): ScreenACoordinator

    fun retrofit(): Retrofit

    //...or Api
}