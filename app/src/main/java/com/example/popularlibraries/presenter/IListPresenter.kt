package com.example.popularlibraries.presenter

import com.example.popularlibraries.IItemView
import com.example.popularlibraries.UserItemView

interface IListPresenter<V : IItemView> {
    var itemClickListener: ((V) -> Unit)?
    fun bindView(view: V)
    fun getCount(): Int
}

interface IUserListPresenter : IListPresenter<UserItemView>