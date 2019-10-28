package org.eightsines.decompiled;

public final class A30 {
    public final void foo() {
        bar$default(this, 0, (String)null, 3, (Object)null);
        bar$default(this, 42, (String)null, 2, (Object)null);
        bar(42, "42");
    }

    private final void bar(int a, String b) {
        System.out.println("a = " + a + ", b = " + b);
    }

    static void bar$default(A30 var0, int var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = 1;
        }

        if ((var3 & 2) != 0) {
            var2 = "Test";
        }

        var0.bar(var1, var2);
    }
}
