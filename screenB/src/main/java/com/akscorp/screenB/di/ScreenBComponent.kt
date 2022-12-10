package com.akscorp.screenB.di

import com.akscorp.core.di.FeatureScope
import com.akscorp.screenB.presentation.ScreenBFragment
import dagger.Component

@FeatureScope
@Component(
    modules = [
        FragmentModule::class
    ],
    dependencies = [ExternalScreenBDeps::class],
)
interface ScreenBComponent {

    fun inject(activity: ScreenBFragment)

}

