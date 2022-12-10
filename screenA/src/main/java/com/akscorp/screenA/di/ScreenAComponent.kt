package com.akscorp.screenA.di

import com.akscorp.core.di.FeatureScope
import com.akscorp.screenA.presentation.ScreenAFragment
import com.akscorp.screenAApi.ScreenAComponentApi
import dagger.Component

@Component(
    modules = [
        FragmentModule::class
    ],
    dependencies = [ExternalScreenADeps::class],
)
@FeatureScope
interface ScreenAComponent : ScreenAComponentApi {

    fun inject(activity: ScreenAFragment)

}

