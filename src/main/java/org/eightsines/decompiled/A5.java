package org.eightsines.decompiled;

import kotlin.jvm.JvmField;

public final class A5 {
    private final void foo(Item item) {
        item.y = 2;
        System.out.println(item.x + ", " + item.y);
    }

    public static final class Item {
        @JvmField
        public final int x;

        @JvmField
        public int y;

        public Item(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
