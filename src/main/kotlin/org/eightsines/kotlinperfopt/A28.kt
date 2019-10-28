package org.eightsines.kotlinperfopt

class A28 {
    private lateinit var a: String

    private fun foo() {
        val b = a + a
        println("b = $b")
    }
}
