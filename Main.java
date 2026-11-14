
import BasicDataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Stack books = new Stack(5);

        // for (int i = 0; i <= 5; i++) {
        // System.out.println(books.push(i));
        // }

        // books.display();

        // for (int i = 0; i <= 5; i++) {
        // System.out.println(books.pop());
        // }

        // SimpleLinearQueue ticketCounter = new SimpleLinearQueue(4);

        // System.err.println(ticketCounter.enqueue("A"));
        // System.err.println(ticketCounter.enqueue("B"));
        // System.err.println(ticketCounter.enqueue("C"));
        // System.err.println(ticketCounter.enqueue("D"));
        // System.err.println(ticketCounter.enqueue("E"));

        // ticketCounter.display();

        // ticketCounter.dequeue();
        // ticketCounter.dequeue();
        // ticketCounter.dequeue();
        // ticketCounter.dequeue();
        // ticketCounter.dequeue();

        // ticketCounter.display();

        // DoubleEndedLinearQueue ticketCounter = new DoubleEndedLinearQueue(4);

        // for (int i = 0; i <= 5; i++) {
        // if (i < 2) {
        // System.out.println(ticketCounter.insertFromFront(i));
        // } else {
        // System.out.println(ticketCounter.insertFromRear(i));
        // }
        // }

        // ticketCounter.display();

        // System.err.println(ticketCounter.deleteFromFront());
        // System.err.println(ticketCounter.deleteFromFront());

        // ticketCounter.display();

        // System.err.println(ticketCounter.deleteFromRear());
        // System.err.println(ticketCounter.deleteFromRear());

        // System.err.println(ticketCounter.deleteFromFront());
        // System.err.println(ticketCounter.deleteFromRear());

        LinkedList<Integer> x = new LinkedList<>();

        x.addLast(10);
        x.addLast(20);
        x.addLast(30);

        x.display();
    }
}
