package org.eightsines.decompiled;

import java.util.ArrayList;
import java.util.Iterator;

public final class A35 {
    private final void f(ArrayList l) {
        Iterable $this$forEach$iv = (Iterable) l;
        Iterator var4 = $this$forEach$iv.iterator();

        while (var4.hasNext()) {
            Object element$iv = var4.next();
            int it = ((Number) element$iv).intValue();
            System.out.println("a = " + it);
        }
    }
}
