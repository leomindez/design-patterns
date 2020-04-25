package com.leo.design.patterns.creational.factory

import com.leo.design.patterns.creational.factory.navigation.AdminNavigation
import com.leo.design.patterns.creational.factory.navigation.GuessNavigation
import com.leo.design.patterns.creational.factory.navigation.Navigation


enum class NavigationTypes {
    ADMIN, GUESS
}

object NavigationFactory {
    fun getNavigation(navigationTypes: NavigationTypes): Navigation {
        return when (navigationTypes) {
            NavigationTypes.ADMIN -> AdminNavigation()
            NavigationTypes.GUESS -> GuessNavigation()
        }
    }
}
