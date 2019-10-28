package org.eightsines.decompiled;

import java.util.ArrayList;
import java.util.List;

public final class A37 {
    private final void f(ArrayList l) {
        List $this$fastForeach$iv = (List) l;
        int i$iv = 0;

        for (int var1 = $this$fastForeach$iv.size(); i$iv < var1; ++i$iv) {
            int it = ((Number) $this$fastForeach$iv.get(i$iv)).intValue();
            System.out.println("a = " + it);
        }
    }
}
