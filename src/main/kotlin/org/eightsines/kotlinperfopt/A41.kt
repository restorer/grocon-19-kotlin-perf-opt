package org.eightsines.kotlinperfopt

class A41 {
    private var a: String? = null

    private fun foo() {
        a!!.let { a ->
            val b = a + a
            println("b = $b")
        }
    }
}
