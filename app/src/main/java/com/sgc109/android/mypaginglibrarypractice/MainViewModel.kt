package com.sgc109.android.mypaginglibrarypractice

import android.arch.lifecycle.ViewModel
import android.arch.paging.PagedList
import io.reactivex.Observable

class MainViewModel : ViewModel() {
    fun getRepos(): Observable<PagedList<Repo>> = RepoRepository.getRepos()
}