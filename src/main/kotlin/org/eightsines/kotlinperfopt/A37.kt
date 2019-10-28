package org.eightsines.kotlinperfopt

// https://habr.com/ru/company/oleg-bunin/blog/420143/

inline fun <reified T> List<T>.fastForeach(crossinline action: (T) -> Unit) {
    for (i in 0 until size) {
        action(this[i])
    }
}

class A37 {
    private fun f(l: ArrayList<Int>) {
        l.fastForeach {
            val a = it
            println("a = $a")
        }
    }
}
