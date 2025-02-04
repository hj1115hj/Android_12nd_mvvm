package com.joocoding.android.app.githubsearch.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.joocoding.android.app.githubsearch.constant.KEY_REPOSITORY
import com.joocoding.android.app.githubsearch.model.data.Detail


class DetailViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    val detail: LiveData<Detail> = savedStateHandle.getLiveData(KEY_REPOSITORY)
}
