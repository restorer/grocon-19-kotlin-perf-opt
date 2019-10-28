package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;

public final class A41 {
    private String a;

    private final void foo() {
        String var10000 = this.a;

        if (var10000 == null) {
            Intrinsics.throwNpe();
        }

        String var1 = var10000;
        String b = var1 + var1;
        System.out.println("b = " + b);
    }
}
