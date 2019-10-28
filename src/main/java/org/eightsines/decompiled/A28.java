package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;

public final class A28 {
    private String a;

    private final void foo() {
        StringBuilder var1 = new StringBuilder();
        String var2 = this.a;

        if (var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("a");
        }

        var1.append(var2);
        var2 = this.a;

        if (var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("a");
        }

        String b = var1.append(var2).toString();
        System.out.println("b = " + b);
    }
}
