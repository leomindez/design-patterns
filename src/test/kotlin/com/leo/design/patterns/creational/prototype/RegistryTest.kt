package com.leo.design.patterns.creational.prototype

import org.junit.Test
import kotlin.test.assertNotNull

internal class RegistryTest {

    @Test
    fun shouldCreateHammerCopyObject() {
        val registry = Registry()
        val hammer = registry.createItem("Hammer") as? Hammer
        hammer?.size = "G"
        assertNotNull(hammer)
    }

    @Test
    fun shouldCreateScrewdriverCopyObject() {
        val registry = Registry()
        val screwdriver = registry.createItem("Screwdriver") as? Screwdriver
        screwdriver?.hasMagnet = false
        assertNotNull(screwdriver)
    }
}