package com.akscorp.screenA.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akscorp.screenA.di.DaggerScreenAComponent
import com.akscorp.core.presentation.BaseFragment
import com.akscorp.screenA.databinding.FragmentABinding
import com.akscorp.screenA.di.ExternalScreenADeps

class ScreenAFragment : BaseFragment() {

    private lateinit var binding: FragmentABinding

    private val viewModel by viewModel<ScreenAViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerScreenAComponent.builder()
            .externalScreenADeps(provideExternalDepsComponent() as ExternalScreenADeps)
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            viewModel.goToScreenB(binding.editText.text?.toString() ?: "")
        }
    }

}