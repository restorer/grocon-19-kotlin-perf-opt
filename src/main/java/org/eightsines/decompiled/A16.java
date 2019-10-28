package org.eightsines.decompiled;

import kotlin.jvm.JvmField;

public final class A16 {
    @JvmField
    public static final int ANSWER = 42;

    public static final A16.Companion Companion = new A16.Companion();

    public static final class Companion {
        private final void foo() {
            System.out.println("Answer = " + A16.ANSWER);
        }
    }
}
