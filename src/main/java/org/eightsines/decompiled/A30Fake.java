package org.eightsines.decompiled;

public class A30Fake {
    public final void foo() {
        bar();
        bar(42);
        bar(42, "42");
    }

    private final void bar() {
        bar(42, "42");
    }

    private final void bar(int a) {
        bar(a, "42");
    }

    private final void bar(int a, String b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}
