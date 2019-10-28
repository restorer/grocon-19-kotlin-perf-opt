package org.eightsines.kotlinperfopt

@Suppress("NOTHING_TO_INLINE")
private inline fun bar() {
    println("Test")
}

class A23 {
    fun foo() {
        bar()
    }
}
