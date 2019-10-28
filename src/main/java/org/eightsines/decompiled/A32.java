package org.eightsines.decompiled;

import java.util.ArrayList;
import java.util.Iterator;

public final class A32 {
    private final void f(ArrayList l) {
        Iterator var1 = l.iterator();

        // Same as "for (Integer a : l) { ... }"
        while (var1.hasNext()) {
            Integer a = (Integer) var1.next();
            System.out.println("a = " + a);
        }
    }
}
