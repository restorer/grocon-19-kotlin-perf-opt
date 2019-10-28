package org.eightsines.kotlinperfopt

@Suppress("NOTHING_TO_INLINE")
private inline fun sq(x: Double) = x * x

class A26 {
    private class Point(@JvmField val x: Double, @JvmField var y: Double)

    private fun foo(x: Double, y: Double, r: Double, p: Point) =
        sq(x - p.x) + sq(y - p.y) < sq(r)
}
