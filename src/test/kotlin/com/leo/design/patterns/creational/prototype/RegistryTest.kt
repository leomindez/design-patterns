package com.leo.design.patterns.creational.prototype

import org.junit.Before
import org.junit.Test
import kotlin.test.assertNotNull

internal class RegistryTest {
    lateinit var prototypeRegistry: PrototypeRegistry

    @Before
    fun setup() {
        prototypeRegistry = PrototypeRegistry()
    }

    @Test
    fun shouldCreateHammerCopyObject() {
        val hammer = prototypeRegistry.createItem("Hammer") as? Hammer
        hammer?.size = "G"
        assertNotNull(hammer)
    }

    @Test
    fun shouldCreateScrewdriverCopyObject() {
        val screwdriver = prototypeRegistry.createItem("Screwdriver") as? Screwdriver
        screwdriver?.hasMagnet = false
        assertNotNull(screwdriver)
    }
}