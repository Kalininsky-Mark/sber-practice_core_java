package org.example.Collections.src.ru.sber.collections.generics;

public class TestLinked<E> {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2,3);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println(linkedList.lastIndexOf(4));
        System.out.println(linkedList.indexOf(4));
        System.out.println(linkedList.contains(4));
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        List list = linkedList.subList(1,3);
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList.pollFirst());
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list.removeAt(0));
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeFirst());
        list.set(0,10);
        System.out.println(list.get(0));
        linkedList.clear();
        System.out.println(linkedList.isEmpty());
    }
}
