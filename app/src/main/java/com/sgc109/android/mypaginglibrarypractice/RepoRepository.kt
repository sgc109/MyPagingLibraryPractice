package com.sgc109.android.mypaginglibrarypractice

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

class RepoRepository {
    val repos: LiveData<List<Repo>> = MutableLiveData()
}