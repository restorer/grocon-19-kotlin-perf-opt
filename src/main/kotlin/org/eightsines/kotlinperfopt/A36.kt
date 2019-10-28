package org.eightsines.kotlinperfopt

class A36 {
    private fun f(l: ArrayList<Int>) {
        l.forEachIndexed { _, b ->
            val a = b
            println("a = $a")
        }
    }
}
