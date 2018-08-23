package com.sgc109.android.mypaginglibrarypractice

import com.google.gson.annotations.SerializedName

data class Repo(
        @SerializedName("name") val title: String,
        @SerializedName("id") val id: String
)