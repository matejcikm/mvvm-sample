package com.example.mvvmsample.ui.fragment

import android.databinding.ObservableField
import com.example.mvvmsample.injection.PerScreen
import com.example.mvvmsample.ui.base.BaseViewModel
import javax.inject.Inject

@PerScreen
class SampleViewModel @Inject constructor(name: String): BaseViewModel() {

	val name = ObservableField<String>(name)
}