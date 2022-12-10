package com.akscorp.bonialtesttask.navigation

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder

class CiceroneTuner(
    private val navigatorHolder: NavigatorHolder,
    private val navigator: Navigator
) : DefaultLifecycleObserver {

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        navigatorHolder.removeNavigator()

    }
}