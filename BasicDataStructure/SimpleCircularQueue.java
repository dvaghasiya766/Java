package BasicDataStructure;

public class SimpleCircularQueue {
    Object[] Q;
    int N;
    int F = -1, R = -1;

    public SimpleCircularQueue(int size) {
        this.Q = new Object[size];
        this.N = size;
    }

    boolean checkFull() {
        return F == 0 && R == N - 1;
    }

    boolean checkEmpty() {
        return F == R && F == -1;
    }

    public String enqueue(Object X) {
        if (checkFull()) {
            return "Queue is Full!!";
        } else {
            if (checkEmpty()) {
                F = 0;
                R = 0;
            } else if (R == N - 1) {
                R = 0;
            } else {
                R++;
            }
            Q[R] = X;
            return X + " is added...";
        }
    }

    public Object dequeue() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        }
        Object X = Q[F];
        Q[F] = null;

        if (F == R) {
            F = -1;
            R = -1;
        } else if (F == N - 1) {
            F = 0;
        } else {
            F++;
        }
        return X;
    }

    public Object peek() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        }
        return Q[F];
    }

    public void display() {
        if (checkEmpty()) {
            System.err.println("Queue is Empty!!");
        } else {
            for (int i = F; i <= R || i <= N; i++) {
                
            }
        }
    }
}
