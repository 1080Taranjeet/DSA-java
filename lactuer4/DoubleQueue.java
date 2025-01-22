package lactuer4;

public class DoubleQueue {
    private static int[] arr;
    private static int front, rear;

    DoubleQueue(int size) {
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    void insertrear(int val) {
        if (rear == front && front != -1) {
            System.out.println("the queue is full");
            return;
        }
        if (rear == -1)
            rear = 0;
        arr[rear] = val;
        rear = (rear + 1) % arr.length;
    }

    void insertfront(int val) {
        if (front == rear && rear != -1) {
            System.out.println("the queue is full");
            return;
        }
        if (front == -1)
            front = 0;
        front = (front - 1 + arr.length) % arr.length;
        arr[front] = val;
    }

    void deletefront() {
        if (front == -1 && rear == -1) {
            System.out.println("the queue is empty");
            return;
        }
        front = (front + 1) % arr.length;
        if (front == rear) {
            front = -1;
            rear = -1;
        }
    }

    void deleterear() {
        if (rear == -1 && front == -1) {
            System.out.println("the queue is empty");
            return;
        }
        rear = (rear - 1 + arr.length) % arr.length;
        if (rear == front) {
            rear = -1;
            front = -1;
        }
    }

    int start() {
        if (rear == -1 && front == -1) {
            System.out.println("the queue is empty");
            return -1;
        }
        return arr[front];
    }

    int end() {
        if (rear == -1 && front == -1) {
            System.out.println("the queue is empty");
            return -1;
        }
        return arr[(rear - 1 + arr.length) % arr.length];
    }

    public static void main(String[] args) {
        DoubleQueue myqueue = new DoubleQueue(6);

        myqueue.insertfront(1);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insertrear(2);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insertfront(3);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insertrear(4);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insertfront(5);
        System.out.println("the value at front is " + myqueue.start());

        System.out.println("the value at rear is " + myqueue.end());

        myqueue.deleterear();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.deletefront();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.deleterear();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.deletefront();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.deleterear();
        System.out.println("the value at front is " + myqueue.start());

    }
}
