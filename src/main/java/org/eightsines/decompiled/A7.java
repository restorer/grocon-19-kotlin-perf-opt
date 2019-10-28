package org.eightsines.decompiled;

public final class A7 {
    private static final int ANSWER = 42;
    public static final Companion Companion = new Companion();

    private final void foo() {
        System.out.println("Answer = " + ANSWER);
    }

    public static final class Companion {
        public final int getANSWER() {
            return A7.ANSWER;
        }
    }
}
