package org.eightsines.kotlinperfopt

class A5 {
    class Item(@JvmField val x: Int, @JvmField var y: Int)

    private fun foo(item: Item) {
        item.y = 2
        println("${item.x}, ${item.y}")
    }
}
