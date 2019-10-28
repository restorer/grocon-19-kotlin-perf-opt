package org.eightsines.kotlinperfopt

class A13 {
    companion object {
        @JvmField
        var cachedAnswer = 1

        private fun foo() {
            cachedAnswer = 42
            println("Ans = $cachedAnswer")
        }
    }
}
