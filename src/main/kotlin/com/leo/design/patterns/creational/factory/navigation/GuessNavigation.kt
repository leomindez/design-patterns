package com.leo.design.patterns.creational.factory.navigation

import com.leo.design.patterns.creational.factory.navigation.section.ViewSection

class GuessNavigation:Navigation() {
    override fun createSections() {
        this.sections.add(ViewSection())
    }
}
