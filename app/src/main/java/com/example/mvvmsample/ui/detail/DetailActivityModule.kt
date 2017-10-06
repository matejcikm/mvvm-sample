package com.example.mvvmsample.ui.detail

import com.example.mvvmsample.injection.PerScreen
import dagger.Module
import dagger.Provides

@Module
class DetailActivityModule {

	@Provides
	@PerScreen
	fun providesName(detailActivity: DetailActivity) =
			detailActivity.intent.getStringExtra(DetailActivity.KEY_NAME)
}