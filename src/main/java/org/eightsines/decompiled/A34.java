package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;

import java.util.ArrayList;
import java.util.Iterator;

public final class A34 {
    private final void f(ArrayList l) {
        Iterator var3 = l.iterator();

        while (var3.hasNext()) {
            Integer b = (Integer) var3.next();
            Intrinsics.checkExpressionValueIsNotNull(b, "b");
            int a = b;
            System.out.println("a = " + a);
        }
    }
}
