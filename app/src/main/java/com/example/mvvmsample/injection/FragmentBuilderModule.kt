package com.example.mvvmsample.injection

import com.example.mvvmsample.ui.fragment.SampleFragment
import com.example.mvvmsample.ui.fragment.SampleFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

	@PerScreen
	@ContributesAndroidInjector(modules = arrayOf(SampleFragmentModule::class))
	internal abstract fun bindSampleFragment(): SampleFragment
}