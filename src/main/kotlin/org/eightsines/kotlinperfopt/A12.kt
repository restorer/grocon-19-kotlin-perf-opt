package org.eightsines.kotlinperfopt

class A12 {
    companion object {
        private var cachedAnswer = 1

        private fun foo() {
            cachedAnswer = 42
            println("Ans = $cachedAnswer")
        }
    }
}
