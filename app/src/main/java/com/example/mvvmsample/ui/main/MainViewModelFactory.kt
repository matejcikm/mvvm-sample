package com.example.mvvmsample.ui.main

import com.example.mvvmsample.injection.PerScreen
import com.example.mvvmsample.ui.base.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider

@PerScreen
class MainViewModelFactory @Inject constructor(private val viewModelProvider: Provider<MainViewModel>) :
		BaseViewModelFactory<MainViewModel>() {

	override val viewModel: MainViewModel
		get() = viewModelProvider.get()
}