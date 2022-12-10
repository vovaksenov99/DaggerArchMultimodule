package com.akscorp.screenA.navigation

import com.akscorp.navigation.CiceroneFragmentScreen
import com.akscorp.screenA.presentation.ScreenAFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens : CiceroneFragmentScreen() {

    override fun provideScreen() = FragmentScreen { ScreenAFragment() }
}