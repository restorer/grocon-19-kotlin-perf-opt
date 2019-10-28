package org.eightsines.decompiled;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.Iterator;

public final class A36 {
    private final void f(ArrayList l) {
        Iterable $this$forEachIndexed$iv = (Iterable) l;
        int index$iv = 0;
        Iterator var1 = $this$forEachIndexed$iv.iterator();

        while (var1.hasNext()) {
            Object item$iv = var1.next();
            int var2 = index$iv++;

            if (var2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }

            int b = ((Number) item$iv).intValue();
            System.out.println("a = " + b);
        }
    }
}
