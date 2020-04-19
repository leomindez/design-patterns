package com.leo.design.patterns.creational.builder

class Query(val where: String?, val orderBy: String?, val select: String?) {
    data class Builder(var where: String? = null, var orderBy: String? = null, var select: String? = null) {
        fun where(where: String) = apply { this.where = where }
        fun orderBy(orderBy: String) = apply { this.orderBy = orderBy }
        fun select(select: String) = apply { this.select = select }
        fun build() = Query(where, orderBy, select)
    }
}
