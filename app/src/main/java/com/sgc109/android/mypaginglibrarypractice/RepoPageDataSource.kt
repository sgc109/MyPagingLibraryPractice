package com.sgc109.android.mypaginglibrarypractice

import android.arch.paging.PageKeyedDataSource

class RepoPageDataSource : PageKeyedDataSource<String, Repo>() {
    var curPage = 1
    override fun loadInitial(params: LoadInitialParams<String>, callback: LoadInitialCallback<String, Repo>) {
        curPage = 1
        RepoApi.create()
                .getRepos(curPage, 20)
                .subscribe { result ->
                    result.response()?.body()?.let {
//                        callback.onResult(it, )
                    }
                }
    }

    override fun loadAfter(params: LoadParams<String>, callback: LoadCallback<String, Repo>) {
        RepoApi.create().getRepos(curPage++, 20)
    }

    override fun loadBefore(params: LoadParams<String>, callback: LoadCallback<String, Repo>) {
        // do nothing
    }
}