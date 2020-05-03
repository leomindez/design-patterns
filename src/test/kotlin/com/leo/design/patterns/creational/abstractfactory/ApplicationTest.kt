package com.leo.design.patterns.creational.abstractfactory

import com.leo.design.patterns.creational.abstractfactory.screenfactory.AndroidScreenFactory
import com.leo.design.patterns.creational.abstractfactory.screenfactory.AppleScreenFactory
import org.junit.Test
import kotlin.test.assertEquals

internal class ApplicationTest {

    @Test
    fun shouldCreateAndroidScreenComponents() {
        Application.createScreen(AndroidScreenFactory())
        assertEquals(Application.toolbar.title, "Android")
        assertEquals(Application.toolbar.backgroundColor, "Green")
        assertEquals(Application.drawer.sections.size, 2)
    }

    @Test
    fun shouldCreateAppleScreenComponents() {
        Application.createScreen(AppleScreenFactory())
        assertEquals(Application.toolbar.title, "Apple")
        assertEquals(Application.toolbar.backgroundColor, "White")
        assertEquals(Application.drawer.sections.size, 3)
    }

}