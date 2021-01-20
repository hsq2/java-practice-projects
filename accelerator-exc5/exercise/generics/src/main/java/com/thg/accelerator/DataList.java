package com.thg.accelerator;

public class DataList<E> implements MiniList<E> {

    private static final int DEFAULT_CAPACITY = 3;
    private Object elements[];
    private int size = 0;

    public DataList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E element) {
        if (size >= elements.length) {
            return false; //add method to increase size
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
}
