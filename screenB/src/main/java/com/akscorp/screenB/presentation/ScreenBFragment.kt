package com.akscorp.screenB.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akscorp.core.presentation.BaseFragment
import com.akscorp.screenB.di.DaggerScreenBComponent
import com.akscorp.screenB.databinding.FragmentBBinding
import com.akscorp.screenB.di.ExternalScreenBDeps

class ScreenBFragment : BaseFragment() {

    private lateinit var binding: FragmentBBinding

    private val viewModel by viewModel<ScreenBViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerScreenBComponent.builder()
            .externalScreenBDeps(provideExternalDepsComponent() as ExternalScreenBDeps)
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.text.observe(viewLifecycleOwner) { text ->
            binding.textFromAScreen.text = text
        }
    }
}