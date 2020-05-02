package com.leo.design.patterns.creational.factory.toolbar

import com.leo.design.patterns.creational.factory.toolbar.action.AboutAction
import com.leo.design.patterns.creational.factory.toolbar.action.AddAction
import com.leo.design.patterns.creational.factory.toolbar.action.ShareAction

class AdminToolbar : Toolbar() {
    override fun createActions() {
        this.actions.add(AboutAction())
        this.actions.add(ShareAction())
        this.actions.add(AddAction())
    }
}