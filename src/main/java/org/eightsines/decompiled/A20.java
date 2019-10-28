package org.eightsines.decompiled;

import kotlin.jvm.JvmStatic;

public final class A20 {
    /** @deprecated */
    @Deprecated
    public static final A20.Companion Companion = new A20.Companion();

    public final void foo() {
        Companion.bar();
    }

    @JvmStatic
    private static final void bar() {
        Companion.bar();
    }

    private static final class Companion {
        @JvmStatic
        private final void bar() {
            System.out.println("Test");
        }
    }
}
