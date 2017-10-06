package com.example.mvvmsample.injection

import com.example.mvvmsample.ui.detail.DetailActivity
import com.example.mvvmsample.ui.detail.DetailActivityModule
import com.example.mvvmsample.ui.main.MainActivity
import com.example.mvvmsample.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

	@PerScreen
	@ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
	internal abstract fun bindMainActivity(): MainActivity

	@PerScreen
	@ContributesAndroidInjector(modules = arrayOf(DetailActivityModule::class))
	internal abstract fun bindDetailActivity(): DetailActivity
}