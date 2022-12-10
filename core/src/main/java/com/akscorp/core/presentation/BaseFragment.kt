package com.akscorp.core.presentation

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akscorp.core.di.AppComponentProvider
import javax.inject.Inject

open class BaseFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected inline fun <reified T : ViewModel> viewModel(): Lazy<T> = lazy {
        ViewModelProvider(this, viewModelFactory)[T::class.java]
    }

    protected fun <T>provideExternalDepsComponent() =
        (requireActivity().applicationContext as AppComponentProvider).getAppComponent() as T

}