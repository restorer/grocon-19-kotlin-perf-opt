package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

public final class A3 {
    public final void bar(@Nullable String a) {
        if (a == null) {
            Intrinsics.throwNpe();
        }

        System.out.println(a);
    }
}
