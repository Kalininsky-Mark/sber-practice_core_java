package org.example2;
import org.example.Collections.src.ru.sber.collections.*;
public class Test_Dep {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println();

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2,3);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println(linkedList.lastIndexOf(4));
        System.out.println(linkedList.indexOf(4));
        System.out.println();



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
    }
}
