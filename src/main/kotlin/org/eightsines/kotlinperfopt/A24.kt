package org.eightsines.kotlinperfopt

class A24 {
    private class Point(@JvmField val x: Double, @JvmField var y: Double)

    private fun foo(x: Double, y: Double, r: Double, p: Point) =
        (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) < r * r
}
