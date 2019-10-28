package org.eightsines.kotlinperfopt

class A30 {
    fun foo() {
        bar()
        bar(42)
        bar(42, "42")
    }

    private fun bar(a: Int = 1, b: String = "Test") {
        println("a = $a, b = $b")
    }
}
