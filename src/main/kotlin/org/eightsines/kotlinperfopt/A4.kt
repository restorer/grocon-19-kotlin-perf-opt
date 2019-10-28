package org.eightsines.kotlinperfopt

class A4 {
    class Item(val x: Int, var y: Int)

    private fun foo(item: Item) {
        item.y = 2
        println("${item.x}, ${item.y}")
    }
}
