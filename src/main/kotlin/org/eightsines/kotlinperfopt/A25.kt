package org.eightsines.kotlinperfopt

class A25 {
    private class Point(@JvmField val x: Double, @JvmField var y: Double)

    private fun sq(x: Double) = x * x

    private fun foo(x: Double, y: Double, r: Double, p: Point) =
        sq(x - p.x) + sq(y - p.y) < sq(r)
}
