package com.leo.design.patterns.creational.abstractfactory.component.navigation

class AppleDrawer : Drawer(
    mutableMapOf(
        "Header" to "apple-header-layout",
        "Sections" to "apple-sections-layout",
        "Footer" to "apple-footer-layout"
    )
)
