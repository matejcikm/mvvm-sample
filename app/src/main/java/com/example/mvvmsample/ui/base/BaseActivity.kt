package com.example.mvvmsample.ui.base

import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import com.example.mvvmsample.BR
import dagger.android.AndroidInjection

abstract class BaseActivity<T : BaseViewModel, B : ViewDataBinding> : AppCompatActivity() {

	protected lateinit var viewModel : T
	protected lateinit var binding : B

	abstract fun createViewModel() : T

	abstract fun inflateBindingLayout(layoutInflater: LayoutInflater) : B

	@CallSuper
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		AndroidInjection.inject(this)

		viewModel = createViewModel()

		binding = inflateBindingLayout(layoutInflater)
		binding.setVariable(BR.view, this)
		binding.setVariable(BR.viewModel, viewModel)
		setContentView(binding.root)
	}
}