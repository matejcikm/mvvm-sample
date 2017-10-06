package com.example.mvvmsample.ui.fragment

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.mvvmsample.databinding.FragmentSampleBinding
import com.example.mvvmsample.tools.Constant
import com.example.mvvmsample.ui.base.BaseFragment
import javax.inject.Inject

class SampleFragment : BaseFragment<SampleViewModel, FragmentSampleBinding>(), SampleView {

	@Inject lateinit var viewModelFactory: SampleViewModelFactory

	companion object {
		fun newInstance(name: String): SampleFragment {
			with(SampleFragment()) {
				val bundle = Bundle()
				bundle.putString(Constant.Argument.KEY_NAME, name)
				arguments = bundle
				return this
			}
		}
	}

	override fun createViewModel(): SampleViewModel =
			ViewModelProviders.of(this, viewModelFactory).get(SampleViewModel::class.java)

	override fun inflateBindingLayout(layoutInflater: LayoutInflater): FragmentSampleBinding =
			FragmentSampleBinding.inflate(layoutInflater)

	override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
	}
}