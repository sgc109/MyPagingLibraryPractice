package com.sgc109.android.mypaginglibrarypractice

import android.arch.paging.PageKeyedDataSource

class RepoPageDataSource: PageKeyedDataSource<String, Repo>() {
    override fun loadInitial(params: LoadInitialParams<String>, callback: LoadInitialCallback<String, Repo>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<String, Repo>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<String, Repo>) {
        // do nothing
    }
}