package org.eightsines.decompiled;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class A1 {
    public final void bar(@NotNull String a) {
        Intrinsics.checkParameterIsNotNull(a, "a");
        System.out.println(a);
    }
}
