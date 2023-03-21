package collections2;

public interface List<E> extends Collection<E> {
    void add(int index, E item);

    void set(int index, E item);

    E get(int index) throws IndexOutOfBoundsException;

    int indexOf(E item);

    int lastIndexOf(E item);
    E removeAt(int index) throws IndexOutOfBoundsException;

    List<E> subList(int from, int to) throws IndexOutOfBoundsException;
}
