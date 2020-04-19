package com.leo.design.patterns.creational.prototype

import org.junit.Before
import org.junit.Test
import kotlin.test.assertNotNull

internal class RegistryTest {
    lateinit var registry: Registry

    @Before
    fun setup() {
        registry = Registry()
    }

    @Test
    fun shouldCreateHammerCopyObject() {
        val hammer = registry.createItem("Hammer") as? Hammer
        hammer?.size = "G"
        assertNotNull(hammer)
    }

    @Test
    fun shouldCreateScrewdriverCopyObject() {
        val screwdriver = registry.createItem("Screwdriver") as? Screwdriver
        screwdriver?.hasMagnet = false
        assertNotNull(screwdriver)
    }
}