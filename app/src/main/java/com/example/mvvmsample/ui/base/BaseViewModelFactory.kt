package com.example.mvvmsample.ui.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

abstract class BaseViewModelFactory<out T : BaseViewModel> : ViewModelProvider.Factory {

	abstract val viewModel : T

	override fun <T : ViewModel> create(modelClass: Class<T>): T {
		return viewModel as T
	}
}