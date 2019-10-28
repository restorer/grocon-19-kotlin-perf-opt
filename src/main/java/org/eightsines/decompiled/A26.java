package org.eightsines.decompiled;

import kotlin.jvm.JvmField;

public final class A26 {
    private final boolean foo(double x, double y, double r, Point p) {
        double x$iv = x - p.x;
        double var1 = x$iv * x$iv;
        x$iv = y - p.y;
        double var2 = x$iv * x$iv;
        return var1 + var2 < r * r;
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
