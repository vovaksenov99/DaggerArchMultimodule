package com.akscorp.screenA.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akscorp.core.di.ViewModelFactory
import com.akscorp.core.di.ViewModelKey
import com.akscorp.screenA.presentation.ScreenAViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentModule {

    @Binds
    @IntoMap
    @ViewModelKey(ScreenAViewModel::class)
    abstract fun homeViewModel(viewModel: ScreenAViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
