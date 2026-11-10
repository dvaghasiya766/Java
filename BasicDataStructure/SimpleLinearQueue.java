package BasicDataStructure;

public class SimpleLinearQueue {
    Object[] Q;
    int N;
    int F, R = -1;

    public SimpleLinearQueue(int size) {
        this.Q = new Object[size];
        this.N = size;
    }

    boolean checkFull() {
        return R >= N - 1;
    }

    boolean checkEmpty() {
        return F == R && F == -1;
    }

    public String enqueue(Object X) {
        if (checkFull()) {
            return "Queue is Full!!";
        }
        if (checkEmpty()) {
            F++;
        }
        R++;
        Q[R] = X;
        return X + " is added...";
    }

    public Object dequeue() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        } else {
            Object X = Q[F];
            Q[F] = null;
            if (F == R && F != -1) {
                F = R = -1;
            } else {
                F++;
            }
            return X;
        }
    }

    public Object peek() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        } else {
            return Q[F];
        }
    }

    public void display() {
        if (checkEmpty()) {
            System.out.println("Queue is Empty!!");
        } else {
            for (int i = F; i <= R; i++) {
                System.out.println(i + " : " + Q[i]);
            }
        }
    }
}
