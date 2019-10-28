package org.eightsines.decompiled;

public final class A6 {
    private static int cachedAnswer = 1;
    public static final Companion Companion = new Companion();

    private final void foo() {
        cachedAnswer = 42;
        System.out.println("Answer = " + cachedAnswer);
    }

    public static final class Companion {
        public final int getCachedAnswer() {
            return cachedAnswer;
        }

        public final void setCachedAnswer(int var1) {
            cachedAnswer = var1;
        }
    }
}
