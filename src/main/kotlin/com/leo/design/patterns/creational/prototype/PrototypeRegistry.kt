package com.leo.design.patterns.creational.prototype

class PrototypeRegistry {
    private val items = hashMapOf<String, Tool>("Hammer" to Hammer(), "Screwdriver" to Screwdriver())
    fun createItem(type: String): Tool? {
        return items[type]?.clone()
    }
}