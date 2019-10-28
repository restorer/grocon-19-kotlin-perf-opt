package org.eightsines.kotlinperfopt

class A20 {
    private companion object {
        @JvmStatic
        private fun bar() {
            println("Test")
        }
    }

    fun foo() {
        bar()
    }
}