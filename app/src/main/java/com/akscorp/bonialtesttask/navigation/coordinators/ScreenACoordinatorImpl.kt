package com.akscorp.bonialtesttask.navigation.coordinators

import com.akscorp.screenB.navigation.Screens
import com.akscorp.screenA.navigation.ScreenACoordinator
import com.github.terrakok.cicerone.Router
import javax.inject.Inject

class ScreenACoordinatorImpl @Inject constructor(
    private val router: Router
) : ScreenACoordinator {

    override fun openBScreen() {
        router.navigateTo(Screens.provideScreen())
    }
}