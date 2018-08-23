package com.sgc109.android.mypaginglibrarypractice

import android.arch.lifecycle.LiveData
import android.arch.paging.DataSource
import android.arch.paging.PagedList
import android.arch.paging.RxPagedListBuilder
import io.reactivex.Observable

class RepoRepository {
    companion object {
        fun getRepos(): Observable<PagedList<Repo>> {
            val config = PagedList.Config.Builder()
                    .setInitialLoadSizeHint(20)
                    .setPageSize(20)
                    .setPrefetchDistance(5)
                    .setEnablePlaceholders(true)
                    .build()
            val builder = RxPagedListBuilder(object : DataSource.Factory<String, Repo>() {
                override fun create(): DataSource<String, Repo> {
                    return RepoPageDataSource()
                }
            }, config)

            return builder.buildObservable()
        }
    }
}