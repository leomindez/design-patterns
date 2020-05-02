package com.leo.design.patterns.creational.factory

import com.leo.design.patterns.creational.factory.toolbar.AdminToolbar
import com.leo.design.patterns.creational.factory.toolbar.GuessToolbar
import com.leo.design.patterns.creational.factory.toolbar.Toolbar

object ToolbarFactory  {
    fun createToolbar(profile: ProfileType): Toolbar {
        return when(profile) {
            ProfileType.ADMIN -> AdminToolbar()
            ProfileType.GUESS -> GuessToolbar()
        }
    }
}