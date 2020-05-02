package com.leo.design.patterns.creational.factory

import org.junit.Test
import kotlin.test.assertEquals

internal class ToolbarFactoryTest {

    @Test
    fun shouldReturnToolbarWitAdminActions() {
        val toolbar = ToolbarFactory.createToolbar(ProfileType.ADMIN)
        assertEquals(toolbar.actions.size, 3)
    }

    @Test
    fun shouldReturnToolbarWithGuessActions() {
        val toolbar = ToolbarFactory.createToolbar(ProfileType.GUESS)
        assertEquals(toolbar.actions.size, 1)
    }
}