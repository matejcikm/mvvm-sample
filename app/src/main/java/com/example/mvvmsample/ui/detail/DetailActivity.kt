package com.example.mvvmsample.ui.detail

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import com.example.mvvmsample.databinding.ActivityDetailBinding
import com.example.mvvmsample.ui.base.BaseActivity
import javax.inject.Inject

class DetailActivity : BaseActivity<DetailViewModel, ActivityDetailBinding>(), DetailView {

	@Inject lateinit var viewModelFactory: DetailViewModelFactory

	companion object {
		val KEY_NAME = "key_name"

		fun getStartIntent(context: Context, name: String) =
				Intent(context, DetailActivity::class.java).putExtra(KEY_NAME, name)
	}

	override fun createViewModel(): DetailViewModel =
			ViewModelProviders.of(this, viewModelFactory).get(DetailViewModel::class.java)

	override fun inflateBindingLayout(layoutInflater: LayoutInflater): ActivityDetailBinding =
			ActivityDetailBinding.inflate(layoutInflater)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		setSupportActionBar(binding.toolbar)
	}
}