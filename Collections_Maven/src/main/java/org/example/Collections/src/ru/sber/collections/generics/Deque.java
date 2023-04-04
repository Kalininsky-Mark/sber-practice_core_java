package org.example.Collections.src.ru.sber.collections.generics;

public interface Deque<E> extends Collection<E> {
    void addFirst(E item);
    void addLast(E item);
    E getFirst();
    E getLast();
    E pollFirst();
    E pollLast();
    E removeFirst();
    E removeLast();
}
