package com.sgc109.android.mypaginglibrarypractice

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_repo_list.view.*

class RepoViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_repo_list, parent, false)
) {
    fun bind(repo: Repo?) {
        itemView.item_repo_title.text = repo?.title
    }
}