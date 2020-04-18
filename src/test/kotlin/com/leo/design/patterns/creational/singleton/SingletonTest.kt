package com.leo.design.patterns.creational.singleton

import Singleton
import org.junit.Test
import kotlin.test.assertEquals

internal class SingletonTest {
    @Test
    fun shouldCreateOnlyOneInstance() {
        val instance = Singleton.instance
        val anotherInstance = Singleton.instance
        assertEquals(instance, anotherInstance)
    }
}