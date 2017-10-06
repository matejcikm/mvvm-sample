package com.example.mvvmsample.ui.detail

import com.example.mvvmsample.injection.PerScreen
import com.example.mvvmsample.ui.base.BaseViewModelFactory
import javax.inject.Inject
import javax.inject.Provider

@PerScreen
class DetailViewModelFactory @Inject constructor(
		private val viewModelProvider: Provider<DetailViewModel>) : BaseViewModelFactory<DetailViewModel>() {

	override val viewModel: DetailViewModel
		get() = viewModelProvider.get()
}