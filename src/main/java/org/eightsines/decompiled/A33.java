package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;

import java.util.ArrayList;

public final class A33 {
    private final void f(ArrayList l) {
        // for
        int i = 0;

        for (int var1 = l.size(); i < var1; ++i) {
            Object var2 = l.get(i);
            Intrinsics.checkExpressionValueIsNotNull(var2, "l[i]");
            int a = ((Number) var2).intValue();
            System.out.println("a = " + a);
        }
    }
}
