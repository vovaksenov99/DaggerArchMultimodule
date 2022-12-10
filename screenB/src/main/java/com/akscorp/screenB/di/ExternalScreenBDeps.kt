package com.akscorp.screenB.di

import com.akscorp.screenAApi.TestAScreenData
import com.akscorp.screenB.navigation.ScreenBCoordinator

interface ExternalScreenBDeps {

    fun testAScreenData(): TestAScreenData
    fun screenBCoordinator(): ScreenBCoordinator
}