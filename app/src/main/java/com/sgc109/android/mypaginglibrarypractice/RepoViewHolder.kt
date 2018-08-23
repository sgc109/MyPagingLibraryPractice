package com.sgc109.android.mypaginglibrarypractice

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class RepoViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_repo_list, parent, false)
) {
    fun bind(respo: Repo?){

    }
}