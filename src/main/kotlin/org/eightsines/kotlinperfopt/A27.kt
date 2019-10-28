package org.eightsines.kotlinperfopt

class A27 {
    private var a: String? = null

    private fun foo() {
        // At this point a != null
        val b = a!! + a!!
        println("b = $b")
    }
}
