package BasicDataStructure;

public class Node<T> {
    private T val;
    private Node<T>[] next;
    private Node<T> prev;

    public Node(T value, Node<T> prev) {
        this.val = value;
        this.prev = prev;
    }

    @SafeVarargs
    public final void setNext(Node<T>... n) {
        this.next = n;
    }

    public T getValue() {
        return val;
    }

    public Node<T> getNext(int child) {
        if (next == null || child < 0 || child >= next.length) {
            return null;
        }
        return next[child];
    }

    public Node<T> getNext() {
        return getNext(0);
    }

    public Node<T> getPrev() {
        return prev;
    }
}