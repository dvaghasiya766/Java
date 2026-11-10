package BasicDataStructure;

public class Stack {
    Object[] S;
    int N;
    int T = -1;

    public Stack(int size) {
        this.S = new Object[size];
        this.N = size;
    }

    boolean checkFull() {
        return T >= N - 1;
    }

    boolean checkEmpty() {
        return T == -1;
    }

    public String push(Object X) {
        if (checkFull()) {
            return "Stack is Full!!";
        } else {
            T++;
            S[T] = X;
            return X + " is added...";
        }
    }

    public Object pop() {
        if (checkEmpty()) {
            return "Stack is Empty!!";
        } else {
            Object X = S[T];
            S[T] = null;
            T--;
            return X;
        }
    }

    public Object peek() {
        if (checkEmpty()) {
            return "Stack is Empty!!";
        } else {
            return S[T];
        }
    }

    public Object peep(int index) {
        if (checkEmpty()) {
            return "Stack is Empty!!";
        } else if ((T - index + 1) >= 0 && (T - index + 1) <= T) {
            return "Error occure: Index out of range!!";
        } else {
            return S[T - index + 1];
        }
    }

    public void change(int index, Object elem) {
        if (checkEmpty()) {
            System.out.println("Stack is Empty!!");
        } else if ((T - index + 1) >= 0 && (T - index + 1) <= T) {
            System.out.println("Error occure: Index out of range!!");
        } else {
            S[T - index + 1] = elem;
        }
    }

    public void display() {
        if (checkEmpty()) {
            System.out.println("Stack is Empty!!");
        } else {
            System.out.println("i : element");
            for (int i = T; i >= 0; i--) {
                System.out.println(T - i + 1 + " : " + S[i]);
            }
        }
    }
}
