package org.eightsines.decompiled;

public final class A11 {
    private static int cachedAnswer = 1;
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public final int getCachedAnswer() {
            return A11.cachedAnswer;
        }

        public final void setCachedAnswer(int var1) {
            A11.cachedAnswer = var1;
        }

        private final void foo() {
            setCachedAnswer(42);
            System.out.println("Ans = " + getCachedAnswer());
        }
    }
}
