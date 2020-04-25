package com.leo.design.patterns.creational.factory.navigation

import com.leo.design.patterns.creational.factory.navigation.section.Section

abstract class Navigation(val sections: MutableList<Section> = mutableListOf()) {

    init {
        this.createSections()
    }

    abstract fun createSections()
}