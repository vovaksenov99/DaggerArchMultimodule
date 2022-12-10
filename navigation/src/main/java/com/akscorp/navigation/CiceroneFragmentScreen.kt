package com.akscorp.navigation

import com.github.terrakok.cicerone.androidx.FragmentScreen

abstract class CiceroneFragmentScreen {

    abstract fun provideScreen(): FragmentScreen
}