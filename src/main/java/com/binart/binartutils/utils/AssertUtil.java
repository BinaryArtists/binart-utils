package com.binart.binartutils.utils;

public class AssertUtil {
    public static void nonull(Object o) {
        nonull(o, "the object must not be null");
    }

    /**
     * Asserts that the given object is not {@code null}.
     *
     * @param o The object to check.
     * @param message A message text which will be used as message of the resulting exception if the given object is
     * {@code null}.
     * @throws IllegalArgumentException In case the given object is {@code null}.
     */
    public static <T> T nonull(T o, String message) {
        if (o == null) {
            throw new IllegalArgumentException(message);
        }

        return o;
    }

    public static <T> T nonull(final T object, final String message, final Object... values) {
        return nonull(object, String.format(message, values));
    }

    public static void yes(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void yes(final boolean expression, final String message, final Object... values) {
        yes(expression, String.format(message, values));
    }

    public static void notEmpty(String s, String message) {
        if (s.length() == 0) {
            throw new IllegalArgumentException(message);
        }
    }
}
