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

    public void addLast(T value) {
        Node<T> newNode;
        if (tail == null) {
            newNode = new Node<>(value); // Don't link with previous for empty linkedlist
        } else {
            newNode = new Node<>(value, tail); // Link old head back to newNode
        }

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
            head.setPrev(newNode); // Link old head's prev back to newNode
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
        } else {
            head.clearPrev(); // Clear reference to removed node
        }
        size--;
        return removedVal;
    }

    public T removeLast() {
        if (tail == null) {
            throw new IllegalStateException("List is Empty");
        }
        T removedVal = tail.getValue();
        tail = tail.getPrev();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(); // Clears next link using empty varargs
        }
        size--;
        return removedVal;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
