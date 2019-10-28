package org.eightsines.decompiled;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class A31 {
    public final void foo() {
        bar$default(this, 0, (String) null, 3, (Object) null);
        bar$default(this, 42, (String) null, 2, (Object) null);
        this.bar(42, "42");
    }

    @JvmOverloads
    public final void bar() {
        bar$default(this, 0, (String) null, 3, (Object) null);
    }

    @JvmOverloads
    public final void bar(int a) {
        bar$default(this, a, (String) null, 2, (Object) null);
    }

    @JvmOverloads
    public final void bar(int a, @NotNull String b) {
        Intrinsics.checkParameterIsNotNull(b, "b");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void bar$default(A31 var0, int var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = 1;
        }

        if ((var3 & 2) != 0) {
            var2 = "Test";
        }

        var0.bar(var1, var2);
    }
}
