package com.example.mvvmsample.ui.fragment

import com.example.mvvmsample.tools.Constant
import dagger.Module
import dagger.Provides

@Module
class SampleFragmentModule {

	@Provides
	fun providesName(sampleFragment: SampleFragment) =
			sampleFragment.arguments.getString(Constant.Argument.KEY_NAME)
}