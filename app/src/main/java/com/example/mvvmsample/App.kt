package com.example.mvvmsample

import com.example.mvvmsample.injection.AppComponent
import com.example.mvvmsample.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {

	override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
		val component: AppComponent = DaggerAppComponent.builder().application(this).build()
		component.inject(this)
		return component
	}
}