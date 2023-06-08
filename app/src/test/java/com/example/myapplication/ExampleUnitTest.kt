package com.example.myapplication

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_that_fail() {
        assertEquals(42, 42)
    }
}