package com.akscorp.bonialtesttask.navigation.coordinators

import com.akscorp.screenB.navigation.ScreenBCoordinator
import com.akscorp.screenB.navigation.Screens
import com.github.terrakok.cicerone.Router
import javax.inject.Inject

class ScreenBCoordinatorImpl @Inject constructor(
    private val router: Router
) : ScreenBCoordinator {

    override fun exit() {
        router.exit()
    }

    override fun open() {
        router.navigateTo(Screens.provideScreen())
    }
}