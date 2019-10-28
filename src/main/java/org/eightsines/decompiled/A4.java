package org.eightsines.decompiled;

public final class A4 {
    private final void foo(Item item) {
        item.setY(2);
        System.out.println(item.getX() + ", " + item.getY());
    }

    public static final class Item {
        private final int x;
        private int y;

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public final void setY(int var1) {
            this.y = var1;
        }

        public Item(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
