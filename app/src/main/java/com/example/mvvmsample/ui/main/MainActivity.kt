package com.example.mvvmsample.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import com.example.mvvmsample.R
import com.example.mvvmsample.databinding.ActivityMainBinding
import com.example.mvvmsample.ui.base.BaseActivity
import com.example.mvvmsample.ui.detail.DetailActivity
import com.example.mvvmsample.ui.fragment.SampleFragment
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(), MainView {

	@Inject lateinit var viewModelFactory: MainViewModelFactory

	override fun createViewModel(): MainViewModel
			= ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

	override fun inflateBindingLayout(layoutInflater: LayoutInflater): ActivityMainBinding
			= ActivityMainBinding.inflate(layoutInflater)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setSupportActionBar(binding.toolbar)

		if (savedInstanceState == null) {
			supportFragmentManager.beginTransaction()
					.replace(R.id.main_content, SampleFragment.newInstance("Sample fragment"))
					.commit()
		}
	}

	override fun onDetail1Click() {
		startActivity(DetailActivity.getStartIntent(this, "detail 1"))
	}

	override fun onDetail2Click() {
		startActivity(DetailActivity.getStartIntent(this, "detail 2"))
	}
}
