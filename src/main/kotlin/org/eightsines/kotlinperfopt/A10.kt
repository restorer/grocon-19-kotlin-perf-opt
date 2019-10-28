package org.eightsines.kotlinperfopt

class A10 {
    companion object {
        const val ANSWER = 42
    }

    private fun foo() {
        val a = ANSWER + 1
        println("Answer = $a")
    }
}
