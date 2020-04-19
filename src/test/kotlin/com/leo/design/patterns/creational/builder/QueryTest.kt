package com.leo.design.patterns.creational.builder

import org.junit.Test
import kotlin.test.assertSame

internal class QueryTest {

    @Test
    fun shouldCreateObjectWithWhereProperty() {
        val query = Query.Builder().where("Persons").build()
        assertSame(query.where, "Persons")
    }

    @Test
    fun shouldCreateObjectWithOrderByProperty() {
        val query = Query.Builder().orderBy("createdAt").build()
        assertSame(query.orderBy, "createdAt")
    }

    @Test
    fun shouldCreateObjectWithSelectProperty() {
        val query = Query.Builder().select("name").build()
        assertSame(query.select, "name")
    }


    @Test
    fun shouldCreateObjectWithAllProperties() {
        val query = Query.Builder().where("Persons").orderBy("name").select("name").build()
        assertSame(query.where, "Persons")
        assertSame(query.orderBy, "name")
        assertSame(query.select, "name")
    }
}