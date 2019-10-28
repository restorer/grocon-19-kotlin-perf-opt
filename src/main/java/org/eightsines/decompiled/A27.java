package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;

public final class A27 {
    private String a;

    private final void foo() {
        StringBuilder var1 = new StringBuilder();
        String var2 = a;

        if (var2 == null) {
            Intrinsics.throwNpe();
        }

        var1.append(var2);
        var2 = a;

        if (var2 == null) {
            Intrinsics.throwNpe();
        }

        String b = var1.append(var2).toString();
        System.out.println("b = " + b);
    }
}
