package com.leo.design.patterns.creational.factory.navigation

import com.leo.design.patterns.creational.factory.navigation.section.AddSection
import com.leo.design.patterns.creational.factory.navigation.section.EditSection
import com.leo.design.patterns.creational.factory.navigation.section.ViewSection

class AdminNavigation : Navigation() {

    override fun createSections() {
        this.sections.add(AddSection())
        this.sections.add(EditSection())
        this.sections.add(ViewSection())
    }
    
}