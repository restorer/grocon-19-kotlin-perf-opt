package org.eightsines.kotlinperfopt

class A29 {
    private var a: String? = null

    private fun foo() {
        val a = this.a!!
        val b = a + a
        println("b = $b")
    }
}
