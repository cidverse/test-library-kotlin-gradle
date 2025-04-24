package io.github.cidverse.test.library.kotlin.gradle

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        require(a != 0) { "Division by zero is not allowed" }
        return a / b
    }
}
