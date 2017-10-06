package com.example.mvvmsample.injection

import android.app.Application
import com.example.mvvmsample.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, AndroidSupportInjectionModule::class,
		AppModule::class, ActivityBuilderModule::class, FragmentBuilderModule::class))
interface AppComponent : AndroidInjector<App> {

	@Component.Builder
	interface Builder {

		@BindsInstance
		fun application(application: Application): Builder

		fun build(): AppComponent
	}

	override fun inject(app: App)
}