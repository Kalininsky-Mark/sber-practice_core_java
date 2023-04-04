package org.example.Collections.src.ru.sber.collections.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class HashMap<E> implements Map<E> {
    private final LinkedList<E>[] buckets;
    private int size;
    public static class Pair<E>{
        E value;
        E key;

        public Pair(E key, E value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<E> getBucket(int index) {
        if (this.buckets[index] == null) {
            return (this.buckets[index] = new LinkedList<E>());
        }

        return this.buckets[index];
    }
    public HashMap() {
        this.buckets = new LinkedList[16];
    }
    private Pair<E> getByKey(E key) {
        LinkedList<E> bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (E rawKvp : bucket) {
            Pair<E> kvp = (Pair<E>) rawKvp;

            if (Objects.equals(kvp.key, key)) {
                return kvp;
            }
        }

        return null;
    }
    private Pair<E> getByValue(E value) {
        for (LinkedList<E> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (E rawKvp : bucket) {
                Pair<E> kvp = (Pair<E>) rawKvp;

                if (Objects.equals(kvp.value, value)) {
                    return kvp;
                }
            }
        }

        return null;
    }
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
    public boolean containsKey(E key) {
        if (key == null) {
            return false;
        }
        return getByKey(key) != null;
    }
    public boolean containsValue(E value) {
        return getByValue(value) != null;
    }
    public E get(E key) {
        Pair<E> kvp = getByKey(key);
        if (kvp == null) {
            return (E) "Данный ключ отсутствует";
        }
        return kvp.value;
    }
    public E put(E key, E value) {
        LinkedList<E> bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (int i = 0; i < bucket.size(); i++) {
            Pair<E> kvp = (Pair<E>) bucket.get(i);

            if (Objects.equals(kvp.key, key)) {
                E objectToReturn = kvp.value;
                bucket.set(i, (E) new Pair(key, value));
                return objectToReturn;
            }
        }

        bucket.addLast((E) new Pair(key, value));
        this.size++;
        return null;
    }
    public E remove(E key) {
        LinkedList<E> bucket = getBucket(Objects.hashCode(key) % buckets.length);
        Iterator<E> it = bucket.iterator();
        int index = 0;

        while (it.hasNext()) {
            Pair<E> kvp = (Pair<E>) it.next();

            if (Objects.equals(kvp.key, key)) {
                Pair<E> previousKvp = (Pair<E>) bucket.removeAt(index);
                this.size--;
                return previousKvp.value;
            }

            index++;
        }

        return null;
    }
    public void clear() {
        Arrays.fill(this.buckets, null);
        size = 0;
    }
    public Collection<E> values() {
        ArrayList<E> newCollection = new ArrayList<E>();

        for (LinkedList<E> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (E rawKvp : bucket) {
                newCollection.add(((Pair<E>) rawKvp).value);
            }
        }

        return newCollection;
    }
    public Collection<E> keySet() {
        ArrayList<E> newCollection = new ArrayList<E>();

        for (LinkedList<E> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (E rawKvp : bucket) {
                newCollection.add(((Pair<E>) rawKvp).key);
            }
        }

        return newCollection;
    }

    public Collection<E> entrySet() {
        ArrayList<E> newCollection = new ArrayList<E>();

        for (LinkedList<E> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (E rawKvp : bucket) {
                newCollection.add(rawKvp);
            }
        }

        return newCollection;
    }
}
