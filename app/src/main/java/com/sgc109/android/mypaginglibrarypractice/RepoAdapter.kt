package com.sgc109.android.mypaginglibrarypractice

import android.arch.paging.PagedListAdapter
import android.support.v7.util.DiffUtil
import android.view.ViewGroup

class RepoAdapter : PagedListAdapter<Repo, RepoViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        return RepoViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val diffCallback = object: DiffUtil.ItemCallback<Repo>() {
            override fun areItemsTheSame(oldItem: Repo?, newItem: Repo?): Boolean {
                return oldItem?.id == newItem?.id
            }

            override fun areContentsTheSame(oldItem: Repo?, newItem: Repo?): Boolean {
                return oldItem?.id == newItem?.id && oldItem?.title == newItem?.title
            }

        }
    }
}