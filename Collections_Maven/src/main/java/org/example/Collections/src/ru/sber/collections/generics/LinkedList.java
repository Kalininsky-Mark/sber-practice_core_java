
package org.example.Collections.src.ru.sber.collections.generics;

import java.util.NoSuchElementException;
import java.util.Objects;
public class LinkedList<E> implements Deque<E>, List<E>, Iterable<E> {
    private class Iterator<E> implements java.util.Iterator<E> {

        private final LinkedList<E> list;

        private int curInd = 0;

        public Iterator(LinkedList<E> list) {
            this.list = list;
        }

        public boolean hasNext() {
            return curInd < list.size();
        }

        public E next() throws NoSuchElementException {
            if (hasNext()) {
                return list.get(curInd++);
            }

            throw new NoSuchElementException();
        }

    }

    private static class Node<E> {
        public E data;

        public Node<E> previous;

        public Node<E> next;

        public Node(E data, Node<E> previous, Node<E> next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
    }

    private Node<E> head;

    private Node<E> tail;

    private int size;

    private void checkBounds() throws NoSuchElementException {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
    }

    private void checkPositionIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Индекс вышел за границы списка");
        }
    }

    private void checkElementIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Индекс вышел за границы списка");
        }
    }

    private Node<E> getNode(int index) throws IndexOutOfBoundsException {
        checkElementIndex(index);

        Node<E> currentNode = this.head;

        while (index-- > 0) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    private E removeNode(Node<E> nodeToRemove) {
        E ElementToReturn = nodeToRemove.data;
        Node<E> nextNode = nodeToRemove.next;
        Node<E> previousNode = nodeToRemove.previous;

        if (previousNode == null) {
            this.head = nextNode;
        } else {
            previousNode.next = nextNode;
        }

        if (nextNode == null) {
            this.tail = previousNode;
        } else {
            nextNode.previous = previousNode;
        }

        this.size--;
        nodeToRemove.data = null;
        size--;
        return ElementToReturn;
    }

    private LinkedList(Node<E> head, Node<E> tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
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
        addLast(item);
        return true;
    }

    public boolean remove(E item) {
        if (item == null) {
            for (Node<E> x =  this.tail; x != null; x = x.next) {
                if (x.data == null) {
                    removeNode(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = this.tail; x != null; x = x.next) {
                if (item.equals(x.data)) {
                    removeNode(x);
                    return true;
                }
            }
        }
        return false;
    }


    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(E item) {
        Node<E> headNode = this.head;
        Node<E> newNode = new Node<E>(item, null, headNode);
        this.head = newNode;

        if (headNode == null) {
            this.tail = newNode;
        } else {
            headNode.previous = newNode;
        }

        this.size++;
    }

    public void addLast (E item) {
        Node<E> tailNode = this.tail;
        Node<E> newNode = new Node<E>(item, tailNode, null);
        this.tail = newNode;

        if (tailNode == null) {
            this.head = newNode;
        } else {
            tailNode.next = newNode;
        }

        this.size++;
    }

    public E getFirst() throws NoSuchElementException {
        checkBounds();

        return this.head.data;
    }


    public E getLast() throws NoSuchElementException {
        checkBounds();

        return this.tail.data;
    }


    public E pollFirst() {
        if (this.head == null) {
            return null;
        }

        return removeFirst();
    }

    public E pollLast() {
        if (this.tail == null) {
            return null;
        }

        return removeLast();
    }

    public E removeLast() throws NoSuchElementException {
        checkBounds();

        E objectToReturn = this.tail.data;
        remove(this.tail.data);
        return objectToReturn;
    }

    public E removeFirst() throws NoSuchElementException {
        checkBounds();

        E objectToReturn = this.head.data;
        remove(this.head.data);
        return objectToReturn;
    }

    public void add(int index, E item) {
        checkPositionIndex(index);

        if (this.size == index) {
            addLast(item);
        } else {
            Node<E> linkToNode = getNode(index);
            Node<E> previousNode = linkToNode.previous;
            Node<E> newNode = new Node<E>(item, previousNode, linkToNode);
            linkToNode.previous = newNode;

            if (previousNode == null) {
                this.head = newNode;
            } else {
                previousNode.next = newNode;
            }

            this.size++;
        }
    }

    public void set(int index, E item) {
        if (this.size == index) {
            addLast(item);
        } else if (this.size > index) {
            getNode(index).data = item;
        }
    }

    public E get(int index) throws IndexOutOfBoundsException {
        return getNode(index).data;
    }

    public int indexOf(E item) {
        int i = 0;

        for (Node<E> currentNode = this.head; currentNode != null; currentNode = currentNode.next) {
            if (Objects.equals(currentNode.data, item)) {
                return i;
            }

            i++;
        }

        return -1;
    }

    public int lastIndexOf(E item) {
        int index = this.size;

        for (Node<E> currentNode = this.tail; currentNode != null; currentNode = currentNode.previous) {
            index--;

            if (Objects.equals(currentNode.data, item)) {
                return index;
            }
        }

        return -1;
    }

    public E removeAt(int index) throws IndexOutOfBoundsException {
        checkElementIndex(index);
        return removeNode(getNode(index));
    }

    public List<E> subList(int from, int to) throws IndexOutOfBoundsException {
        checkElementIndex(from);
        checkPositionIndex(to);

        return new LinkedList<E>(getNode(from), getNode(to - 1), to - from + 1);
    }

    public Iterator<E> iterator() {
        return new Iterator<E>(this);
    }
}