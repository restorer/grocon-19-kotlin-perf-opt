package org.eightsines.kotlinperfopt

import kotlin.math.sin

class A40 {
    fun foo(a: Float) {
        val b = sin(a)
        println("b = $b")
    }
}
