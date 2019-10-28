package org.eightsines.kotlinperfopt

class A35 {
    private fun f(l: ArrayList<Int>) {
        l.forEach {
            val a = it
            println("a = $a")
        }
    }
}
