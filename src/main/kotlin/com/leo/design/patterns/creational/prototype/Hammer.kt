package com.leo.design.patterns.creational.prototype

class Hammer(var size: String = "M") : Tool() {
    override fun clone(): Tool {
        return Hammer()
    }
}