package io.github.cidverse.test.library.kotlin.gradle

import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.add(2, 3)
        assert(result == 5) { "Expected 5 but got $result" }
    }

    @Test
    fun testSubtract() {
        val calculator = Calculator()
        val result = calculator.subtract(5, 3)
        assert(result == 2) { "Expected 2 but got $result" }
    }

    @Test
    fun testMultiply() {
        val calculator = Calculator()
        val result = calculator.multiply(2, 3)
        assert(result == 6) { "Expected 6 but got $result" }
    }

    @Test
    fun testDivide() {
        val calculator = Calculator()
        val result = calculator.divide(6, 3)
        assert(result == 2) { "Expected 2 but got $result" }
    }
}
