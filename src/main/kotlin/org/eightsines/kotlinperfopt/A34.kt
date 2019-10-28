package org.eightsines.kotlinperfopt

class A34 {
    private fun f(l: ArrayList<Int>) {
        for (b in l) {
            val a = b
            println("a = $a")
        }
    }
}