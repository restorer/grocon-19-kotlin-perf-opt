package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;

public final class A29 {
    private String a;

    private final void foo() {
        String var1 = this.a;

        if (var1 == null) {
            Intrinsics.throwNpe();
        }

        String a = var1;
        String b = a + a;
        System.out.println("b = " + b);
    }
}
