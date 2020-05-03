package com.leo.design.patterns.creational.abstractfactory.screenfactory

import com.leo.design.patterns.creational.abstractfactory.component.navigation.Drawer
import com.leo.design.patterns.creational.abstractfactory.component.toolbar.Toolbar

interface ScreenFactory {
    fun createToolbar(): Toolbar
    fun createDrawer(): Drawer
}