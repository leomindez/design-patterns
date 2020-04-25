package com.leo.design.patterns.creational.factory

import org.junit.Test
import kotlin.test.assertNotNull
import kotlin.test.assertSame

internal class NavigationFactoryTest {

    @Test
    fun shouldReturnAdminNavigation() {
        val adminNavigation = NavigationFactory.getNavigation(NavigationTypes.ADMIN)
        assertNotNull(adminNavigation)
        assertSame(adminNavigation.sections.size,3)
    }

    @Test
    fun shouldReturnGuessNavigation() {
        val guessNavigation = NavigationFactory.getNavigation(NavigationTypes.GUESS)
        assertNotNull(guessNavigation)
        assertSame(guessNavigation.sections.size,1)
    }

}