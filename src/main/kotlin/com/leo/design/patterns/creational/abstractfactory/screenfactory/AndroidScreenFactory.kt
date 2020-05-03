package com.leo.design.patterns.creational.abstractfactory.screenfactory

import com.leo.design.patterns.creational.abstractfactory.component.navigation.AndroidDrawer
import com.leo.design.patterns.creational.abstractfactory.component.navigation.Drawer
import com.leo.design.patterns.creational.abstractfactory.component.toolbar.AndroidToolbar
import com.leo.design.patterns.creational.abstractfactory.component.toolbar.Toolbar

class AndroidScreenFactory : ScreenFactory {
    override fun createToolbar(): Toolbar = AndroidToolbar()
    override fun createDrawer(): Drawer = AndroidDrawer()
}