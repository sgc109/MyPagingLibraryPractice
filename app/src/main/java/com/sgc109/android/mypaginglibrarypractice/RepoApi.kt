package com.sgc109.android.mypaginglibrarypractice

import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.Result
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RepoApi {
    companion object {
        fun create(): RepoApi {
            return Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(OkHttpClient.Builder()
                            .build())
                    .baseUrl("https://api.github.com")
                    .build()
                    .create(RepoApi::class.java)
        }
    }

    @GET("/search/repositories?q=e")
    fun getRepos(@Query("page") pageNo: Int, @Query("per_page") itemCntPerPage: Int): Single<Result<List<Repo>>>
}