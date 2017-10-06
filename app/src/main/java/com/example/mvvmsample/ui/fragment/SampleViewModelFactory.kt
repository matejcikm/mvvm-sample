package com.example.mvvmsample.ui.fragment

import com.example.mvvmsample.injection.PerScreen
import com.example.mvvmsample.ui.base.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider

@PerScreen
class SampleViewModelFactory @Inject constructor(private val viewModelProvider: Provider<SampleViewModel>) :
		BaseViewModelFactory<SampleViewModel>() {

	override val viewModel: SampleViewModel
		get() = viewModelProvider.get()
}