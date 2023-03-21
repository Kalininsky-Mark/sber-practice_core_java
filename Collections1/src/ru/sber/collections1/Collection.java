package ru.sber.collections1;

import java.util.Iterator;

public interface Collection extends Iterable {
    int size();
    boolean isEmpty();
    boolean contains(Object item);
    boolean add(Object item);
    boolean remove(Object item);
    void clear();
}
