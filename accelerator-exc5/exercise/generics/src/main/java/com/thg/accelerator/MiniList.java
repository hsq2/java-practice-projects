package com.thg.accelerator;

public interface MiniList<E> {
  boolean add(E element);

  int size();

  E get(int index);
}
