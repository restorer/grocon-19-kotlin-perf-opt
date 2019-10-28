package org.eightsines.decompiled;

public final class A14 {
    private static final int ANSWER = 42;
    public static final A14.Companion Companion = new A14.Companion();

    public static final class Companion {
        public final int getANSWER() {
            return A14.ANSWER;
        }

        private final void foo() {
            System.out.println("Answer = " + getANSWER());
        }
    }
}
