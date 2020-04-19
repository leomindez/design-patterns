package com.leo.design.patterns.creational.prototype

data class Screwdriver(var hasMagnet: Boolean = true) : Tool() {
    override fun clone(): Tool {
        return Screwdriver()
    }
}