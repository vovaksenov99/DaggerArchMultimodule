package com.akscorp.screenB.navigation

import com.akscorp.navigation.CiceroneFragmentScreen
import com.akscorp.screenB.presentation.ScreenBFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens : CiceroneFragmentScreen() {

    override fun provideScreen() = FragmentScreen { ScreenBFragment() }
}