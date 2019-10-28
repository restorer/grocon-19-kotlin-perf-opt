package org.eightsines.kotlinperfopt

class A31 {
    fun foo() {
        bar()
        bar(42)
        bar(42, "42")
    }

    // '@JvmOverloads' annotation has no effect on private declarations
    @JvmOverloads
    fun bar(a: Int = 1, b: String = "Test") {
        println("a = $a, b = $b")
    }
}