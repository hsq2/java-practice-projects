package com.thg.accelerator;

import java.util.Arrays;

public class DataList<E> implements MiniList<E> {

    private static final int DEFAULT_CAPACITY = 3;
    private Object elements[];
    private int size = 0;

    public DataList() {
        elements = new Object[DEFAULT_CAPACITY];
    }



    @Override
    public boolean add(E element) {
        if (size == elements.length) {
            increaseSize();
        }
        elements[size++] = element;
        return elements[size - 1] == element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
        }
        return (E) elements[index];
    }

    private void increaseSize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
