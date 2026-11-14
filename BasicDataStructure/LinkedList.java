package BasicDataStructure;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is Empty");
        }
        T removedVal = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return removedVal;
    }

    public T removeLast() {
        if (tail == null) {
            throw new IllegalStateException("List is Empty");
        }
        T removedVal = tail.getValue();
        tail=
        return removedVal;
    }

    public void display() {
        Node<T> next = head;
        for (int i = 0; i < size; i++) {
            System.out.print(next.getValue() + " -> ");
            next = next.getNext();
        }
        System.out.println("null");
    }
}
