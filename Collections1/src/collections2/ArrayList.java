package collections2;

import java.util.NoSuchElementException;
import java.util.Objects;
public class ArrayList<E> implements List<E> {
    private static class Iterator<E> implements java.util.Iterator<E> {

        private int CurI = 0;
        private final ArrayList<E> list2;


        public Iterator(ArrayList<E> list2) {
            this.list2 = list2;
        }

        public boolean hasNext() {
            return CurI < list2.size();
        }

        public E next() throws NoSuchElementException {
            if (hasNext()) {
                return list2.get(CurI++);
            }

            throw new NoSuchElementException();
        }
    }

    private static final int sizelist = 5;

    private E[]    data;

    private int size = 0;

    private void checkI(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Индекс вышел за границы списка");
        }
    }

    private ArrayList(E[] data, int size) {
        this.data = data;
        this.size = size;
    }

    public ArrayList() {
        this.data = (E[]) new Object[sizelist];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(E item) {
        return indexOf(item) >= 0;
    }

    public boolean add(E item) {
        if (this.size + 1 >= this.data.length) {
            E[] newData = (E[]) new Object[((this.size + 1) * 3) / 2 + 1];
            System.arraycopy(this.data, 0, newData, 0, this.data.length);
            this.data = newData;
        }

        this.data[this.size++] = item;
        return true;
    }

    public boolean remove(E item) {
        int previousSize = this.size;
        int i = indexOf(item);

        while (i != -1) {
            removeAt(i);
            i = indexOf(item);
        }

        return this.size == previousSize;
    }

    public void clear() {
        this.data = (E[]) new Object[sizelist];
        this.size = 0;
    }

    public void add(int index, E item) {
        if (index == this.size) {
            add(item);
            return;
        }

        if (index > this.size) {
            return;
        }

        E[] oldArray = this.data;

        if (this.size + 1 >= this.data.length) {
            E[] newData = (E[]) new Object[((this.size + 1) * 3) / 2 + 1];
            System.arraycopy(this.data, 0, newData, 0, index);
            this.data = newData;
        }

        System.arraycopy(oldArray, index, this.data, index + 1, this.size - index);
        this.data[index] = item;
        this.size++;
    }

    public void set(int i, E item) {
        if (i == this.size) {
            add(item);
        } else if (i < this.size) {
            this.data[i] = item;
        }
    }

    public E get(int index) throws IndexOutOfBoundsException {
        checkI(index);

        return (E) this.data[index];
    }

    public int indexOf(E item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < this.size; i++) {
            if (Objects.equals(this.data[i], item)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(E item) {
        if (item == null) {
            return -1;
        }

        for (int i = this.size - 1; i >= 0; i--) {
            if (this.data[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public E removeAt(int index) throws IndexOutOfBoundsException {
        checkI(index);

        E objectToReturn = this.data[index];
        this.data[index] = null;
        System.arraycopy(this.data, index + 1, this.data, index, this.size - index);
        this.size--;

        return objectToReturn;
    }

    public List<E> subList(int left, int right) throws IndexOutOfBoundsException {
        checkI(left);
        checkI(right);
        int copySize = right - left +1;
        E[] newlist = (E[]) new Object[copySize];
        System.arraycopy(this.data, left, newlist, 0, copySize);
        return new ArrayList<E>(newlist, copySize);
    }

    public Iterator<E> iterator() {
        return new Iterator<E>(this);
    }
}