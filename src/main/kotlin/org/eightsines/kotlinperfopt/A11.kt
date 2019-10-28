package org.eightsines.kotlinperfopt

class A11 {
    companion object {
        var cachedAnswer = 1

        private fun foo() {
            cachedAnswer = 42
            println("Ans = $cachedAnswer")
        }
    }
}
