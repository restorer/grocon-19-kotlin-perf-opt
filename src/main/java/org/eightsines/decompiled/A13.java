package org.eightsines.decompiled;

import kotlin.jvm.JvmField;

public final class A13 {
    @JvmField
    public static int cachedAnswer = 1;

    public static final Companion Companion = new Companion();

    public static final class Companion {
        private final void foo() {
            A13.cachedAnswer = 42;
            System.out.println("Ans = " + A13.cachedAnswer);
        }
    }
}
