package com.leo.design.patterns.creational.factory

import com.leo.design.patterns.creational.factory.navigation.AdminNavigation
import com.leo.design.patterns.creational.factory.navigation.GuessNavigation
import com.leo.design.patterns.creational.factory.navigation.Navigation

object NavigationFactory {
    fun getNavigation(profile: ProfileType): Navigation {
        return when (profile) {
            ProfileType.ADMIN -> AdminNavigation()
            ProfileType.GUESS -> GuessNavigation()
        }
    }
}
