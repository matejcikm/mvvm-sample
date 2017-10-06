package com.example.mvvmsample.ui.detail

import android.databinding.ObservableField
import com.example.mvvmsample.injection.PerScreen
import com.example.mvvmsample.ui.base.BaseViewModel
import javax.inject.Inject

@PerScreen
class DetailViewModel @Inject constructor(name: String): BaseViewModel() {

	val id = ObservableField<String>(name)
}