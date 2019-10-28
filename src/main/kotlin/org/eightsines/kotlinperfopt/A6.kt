package org.eightsines.kotlinperfopt

class A6 {
    companion object {
        var cachedAnswer = 1
    }

    private fun foo() {
        cachedAnswer = 42
        println("Answer = $cachedAnswer")
    }
}