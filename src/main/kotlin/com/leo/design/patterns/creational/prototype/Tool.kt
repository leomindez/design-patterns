package com.leo.design.patterns.creational.prototype

abstract class Tool(
    var type: String = "",
    var name: String = "",
    var cost: String = "",
    var color: String = ""
): Prototype

