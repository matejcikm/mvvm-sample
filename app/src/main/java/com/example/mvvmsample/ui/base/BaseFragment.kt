package com.example.mvvmsample.ui.base

import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvvmsample.BR
import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment<T : BaseViewModel, B : ViewDataBinding> : Fragment() {

	protected lateinit var viewModel: T
	protected lateinit var binding: B

	abstract fun createViewModel() : T

	abstract fun inflateBindingLayout(layoutInflater: LayoutInflater) : B

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		AndroidSupportInjection.inject(this)

		viewModel = createViewModel()

		binding = inflateBindingLayout(inflater)
		binding.setVariable(BR.view, this)
		binding.setVariable(BR.viewModel, viewModel)

		return binding.root
	}
}