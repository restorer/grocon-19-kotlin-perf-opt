package org.eightsines.decompiled;

import kotlin.jvm.JvmField;

public final class A25 {
    private final double sq(double x) {
        return x * x;
    }

    private final boolean foo(double x, double y, double r, A25.Point p) {
        return sq(x - p.x) + sq(y - p.y) < sq(r);
    }

    private static final class Point {
        @JvmField
        public final double x;

        @JvmField
        public double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
