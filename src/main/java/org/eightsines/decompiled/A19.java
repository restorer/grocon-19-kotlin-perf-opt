package org.eightsines.decompiled;

import kotlin.jvm.JvmStatic;

public final class A19 {
    public static final A19.Companion Companion_ = new A19.Companion();

    public final void foo() {
        Companion_.bar();
    }

    @JvmStatic
    public static final void bar() {
        Companion_.bar();
    }

    public static final class Companion {
        @JvmStatic
        public final void bar() {
            System.out.println("Test");
        }
    }
}
