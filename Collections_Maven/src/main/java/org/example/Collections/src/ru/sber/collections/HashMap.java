package org.example.Collections.src.ru.sber.collections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class HashMap implements Map{
    private final LinkedList[] buckets;
    private int size;
    public static class Pair{
        Object value;
        Object key;

        public Pair(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList getBucket(int index) {
        if (this.buckets[index] == null) {
            return (this.buckets[index] = new LinkedList());
        }

        return this.buckets[index];
    }
    public HashMap() {
        this.buckets = new LinkedList[16];
    }
    private Pair getByKey(Object key) {
        LinkedList bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (Object rawKvp : bucket) {
            Pair kvp = (Pair) rawKvp;

            if (Objects.equals(kvp.key, key)) {
                return kvp;
            }
        }

        return null;
    }
    private Pair getByValue(Object value) {
        for (LinkedList bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : bucket) {
                Pair kvp = (Pair) rawKvp;

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
    public boolean containsKey(Object key) {
        if (key == null) {
            return false;
        }
        return getByKey(key) != null;
    }
    public boolean containsValue(Object value) {
        return getByValue(value) != null;
    }
    public Object get(Object key) {
        Pair kvp = getByKey(key);
        if (kvp == null) {
            return "Данный ключ отсутствует";
        }
        return kvp.value;
    }
    public Object put(Object key, Object value) {
        LinkedList bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (int i = 0; i < bucket.size(); i++) {
            Pair kvp = (Pair) bucket.get(i);

            if (Objects.equals(kvp.key, key)) {
                Object objectToReturn = kvp.value;
                bucket.set(i, new Pair(key, value));
                return objectToReturn;
            }
        }

        bucket.addLast(new Pair(key, value));
        this.size++;
        return null;
    }
    public Object remove(Object key) {
        LinkedList bucket = getBucket(Objects.hashCode(key) % buckets.length);
        Iterator<Object> it = bucket.iterator();
        int index = 0;

        while (it.hasNext()) {
            Pair kvp = (Pair) it.next();

            if (Objects.equals(kvp.key, key)) {
                Pair previousKvp = (Pair) bucket.removeAt(index);
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
    public Collection values() {
        ArrayList newCollection = new ArrayList();

        for (LinkedList bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : bucket) {
                newCollection.add(((Pair) rawKvp).value);
            }
        }

        return newCollection;
    }
    public Collection keySet() {
        ArrayList newCollection = new ArrayList();

        for (LinkedList bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : bucket) {
                newCollection.add(((Pair) rawKvp).key);
            }
        }

        return newCollection;
    }

    public Collection entrySet() {
        ArrayList newCollection = new ArrayList();

        for (LinkedList bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : bucket) {
                newCollection.add(rawKvp);
            }
        }

        return newCollection;
    }
}
