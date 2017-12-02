package com.company.lessons16;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax() {
    }

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MinMax<?> minMax = (MinMax<?>) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(array, minMax.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public T min(T[] array) {
        T min = array[0];
        for (T tmp : array) {
            if (tmp.doubleValue() < min.doubleValue())
                min = tmp;
        }
        return min;
    }

    public T max(T[] array) {
        T max = array[0];
        for (T tmp : array) {
            if (tmp.doubleValue() > max.doubleValue())
                max = tmp;
        }
        return max;
    }
}
