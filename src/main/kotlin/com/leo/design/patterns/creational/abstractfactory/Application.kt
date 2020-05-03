package com.leo.design.patterns.creational.abstractfactory

import com.leo.design.patterns.creational.abstractfactory.component.navigation.Drawer
import com.leo.design.patterns.creational.abstractfactory.component.toolbar.Toolbar
import com.leo.design.patterns.creational.abstractfactory.screenfactory.ScreenFactory

object Application {

    lateinit var toolbar: Toolbar
    lateinit var drawer: Drawer

    fun createScreen(screenFactory: ScreenFactory) {
        toolbar = screenFactory.createToolbar()
        drawer = screenFactory.createDrawer()
    }
}