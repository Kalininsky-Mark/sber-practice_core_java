package org.example.Collections.src.ru.sber.collections.generics;

public interface Map<E> {
    int size();
    boolean isEmpty();
    boolean containsKey(E key);
    boolean containsValue(E value);
    E get(E key);
    E put(E key, E value);
    E remove(E key);
    void clear();
    Collection<E> values();
    Collection<E> keySet();
    Collection<E> entrySet();
}
