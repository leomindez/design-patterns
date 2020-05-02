package com.leo.design.patterns.creational.factory.toolbar

import com.leo.design.patterns.creational.factory.toolbar.action.Action

abstract class Toolbar(val actions: MutableList<Action> = mutableListOf()) {
    init {
        this.createActions()
    }

    abstract fun createActions()
}