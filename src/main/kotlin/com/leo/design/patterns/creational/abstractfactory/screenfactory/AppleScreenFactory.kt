package com.leo.design.patterns.creational.abstractfactory.screenfactory

import com.leo.design.patterns.creational.abstractfactory.component.navigation.AppleDrawer
import com.leo.design.patterns.creational.abstractfactory.component.navigation.Drawer
import com.leo.design.patterns.creational.abstractfactory.component.toolbar.AppleToolbar
import com.leo.design.patterns.creational.abstractfactory.component.toolbar.Toolbar

class AppleScreenFactory : ScreenFactory {
    override fun createToolbar(): Toolbar = AppleToolbar()
    override fun createDrawer(): Drawer = AppleDrawer()
}