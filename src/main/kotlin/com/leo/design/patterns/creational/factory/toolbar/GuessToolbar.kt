package com.leo.design.patterns.creational.factory.toolbar

import com.leo.design.patterns.creational.factory.toolbar.action.AboutAction

class GuessToolbar : Toolbar() {
    override fun createActions() {
        this.actions.add(AboutAction())
    }
}