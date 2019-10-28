package org.eightsines.kotlinperfopt

class A33 {
    private fun f(l: ArrayList<Int>) {
        for (i in 0 until l.size) {
            val a = l[i]
            println("a = $a")
        }
    }
}