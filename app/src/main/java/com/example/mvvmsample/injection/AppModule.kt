package com.example.mvvmsample.injection

import android.content.Context
import com.example.mvvmsample.App
import dagger.Module
import dagger.Provides

@Module
class AppModule {

	@Provides
	@ApplicationContext
	fun applicationContext(app : App) : Context {
		return app
	}
}