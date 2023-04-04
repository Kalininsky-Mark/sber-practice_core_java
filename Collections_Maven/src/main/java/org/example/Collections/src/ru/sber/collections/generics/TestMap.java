package org.example.Collections.src.ru.sber.collections.generics;

public class TestMap<E> {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        System.out.println(hashMap.size());
        HashMap.Pair p = new HashMap.Pair(1,1);
        hashMap.put(0,0);
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(0,3);
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(0));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.containsKey(0));
        System.out.println(hashMap.containsValue(0));
        System.out.println(hashMap.values().contains(0));
        System.out.println(hashMap.keySet().contains(0));
        System.out.println(hashMap.entrySet().contains(p));
        System.out.println(hashMap.remove(0));
        System.out.println(hashMap.get(0));
        hashMap.clear();
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
    }
}
