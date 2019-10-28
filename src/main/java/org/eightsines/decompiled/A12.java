package org.eightsines.decompiled;

public final class A12 {
    private static int cachedAnswer = 1;
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private final void foo() {
            A12.cachedAnswer = 42;
            System.out.println("Ans = " + A12.cachedAnswer);
        }
    }
}
