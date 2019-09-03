package com.jv.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;

public class ArrayUtil {

    /**
     * An empty immutable {@code String} array.
     */
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    /**
     * An empty immutable {@code Annotation} array.
     */
    public static final Annotation[] EMPTY_ANNOTATION_ARRAY = new Annotation[0];

    /**
     * An empty immutable {@code Class} array.
     */
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];

    /**
     * <p>
     * Outputs an array as a String, treating {@code null} as an empty array.
     * </p>
     * <p>
     * Multi-dimensional arrays are handled correctly, including multi-dimensional primitive arrays.
     * </p>
     * <p>
     * The format is that of Java source code, for example <code>{a,b}</code>.
     * </p>
     *
     * @param array the array to get a toString for, may be {@code null}
     * @return a String representation of the array, '{}' if null array input
     */
    public static String toString(Object array) {
        if (array == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        if (array.getClass().isArray()) {
            for (Object o : (Object[]) array) {
                sb.append(o.toString()).append(",");
            }
        }

        return sb.toString();
    }

    /**
     * <p>
     * Checks if an array of Objects is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive longs is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(long[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive ints is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(int[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive shorts is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(short[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive chars is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(char[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive bytes is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(byte[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive doubles is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(double[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive floats is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(float[] array) {
        return array == null || array.length == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive booleans is empty or {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is empty or {@code null}
     * @since 2.1
     */
    public static boolean isEmpty(boolean[] array) {
        return array == null || array.length == 0;
    }

    // ----------------------------------------------------------------------
    /**
     * <p>
     * Checks if an array of Objects is not empty or not {@code null}.
     * </p>
     *
     * @param <T> the component type of the array
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static <T> boolean isNotEmpty(T[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive longs is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(long[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive ints is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(int[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive shorts is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(short[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive chars is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(char[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive bytes is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(byte[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive doubles is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(double[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive floats is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(float[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if an array of primitive booleans is not empty or not {@code null}.
     * </p>
     *
     * @param array the array to test
     * @return {@code true} if the array is not empty or not {@code null}
     * @since 2.5
     */
    public static boolean isNotEmpty(boolean[] array) {
        return (array != null && array.length != 0);
    }

    /**
     * <p>
     * Checks if the object is in the given array.
     * <p>
     * The method returns {@code false} if a {@code null} array is passed in.
     *
     * @param array the array to search through
     * @param objectToFind the object to find
     * @return {@code true} if the array contains the object
     */
    public static boolean contains(final Object[] array, final Object objectToFind) {
        if (array == null) {
            return false;
        }
        for (Object o : array) {
            if (o.equals(objectToFind)) {
                return true;
            }
        }
        return false;
    }

    /***
     * add a object to an array.
     *
     * @param array array object
     * @param objectToAdd object to add
     * @param <T> array component type
     * @return new array object
     */
    public static <T> T[] add(T[] array, T objectToAdd) {
        Class<?> type;
        if (array != null) {
            type = array.getClass().getComponentType();
        } else if (objectToAdd != null) {
            type = objectToAdd.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }

        final int arrayLength = Array.getLength(array);
        T[] newArray = (T[]) Array.newInstance(type, arrayLength + 1);
        System.arraycopy(array, 0, newArray, 0, arrayLength);
        newArray[newArray.length - 1] = objectToAdd;

        return newArray;
    }
}
