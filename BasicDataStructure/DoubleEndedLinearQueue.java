package BasicDataStructure;

public class DoubleEndedLinearQueue {
    Object[] Q;
    int N;
    int F = -1, R = -1;

    public DoubleEndedLinearQueue(int size) {
        this.Q = new Object[size];
        this.N = size;
    }

    boolean checkFullFromFront() {
        return F == 0;
    }

    boolean checkFullFromRear() {
        return R >= N - 1;
    }

    boolean checkEmpty() {
        return F == R && F == -1;
    }

    public String insertFromFront(Object X) {
        if (checkFullFromFront()) {
            return "Queue is Full!! cannot insert " + X + " from Front...";
        }

        if (checkEmpty()) {
            F = 0;
            R = 0;
        } else {
            F--;
        }

        Q[F] = X;
        return X + " is added from Front...";
    }

    public String insertFromRear(Object X) {
        if (checkFullFromRear()) {
            return "Queue is Full!! cannot insert " + X + " from Rear...";
        }
        if (checkEmpty()) {
            F++;
        }
        R++;
        Q[R] = X;
        return X + " is added from Rear...";
    }

    public Object deleteFromFront() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        }
        Object X = Q[F];
        Q[F] = null;
        if (F == R && F != -1) {
            F = -1;
            R = -1;
        } else {
            F++;
        }
        return X;
    }

    public Object deleteFromRear() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        }
        Object X = Q[R];
        Q[R] = null;
        if (F == R && F != -1) {
            F = -1;
            R = -1;
        } else {
            R--;
        }
        return X;
    }

    public Object peekFromFront() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        }
        return Q[F];
    }

    public Object peekFromRear() {
        if (checkEmpty()) {
            return "Queue is Empty!!";
        }
        return Q[R];
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
