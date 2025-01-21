package lactuer4;

public class QueueWithArray {

    private static int[] arr;
    private static int front, rear;

    QueueWithArray(int size) {
        front = 0;
        rear = 0;
        arr = new int[size];
    }

    void insert(int val) {
        if (rear == arr.length) {
            System.out.println("the queue is full");
            return;
        }
        arr[rear] = val;
        rear++;
    }

    void delete() {
        if (rear == front) {
            System.out.println("the queie is empty");
            return;
        }
        front++;
        if (front == rear) {
            front = 0;
            rear = 0;
        }
    }

    int start() {
        if (rear == front) {
            System.out.println("the queie is empty");
            return -1;
        }
        return arr[front];
    }

    int end() {
        if (rear == front) {
            System.out.println("the queie is empty");
            return -1;
        }
        return arr[rear - 1];
    }

    public static void main(String[] args) {
        QueueWithArray myqueue = new QueueWithArray(6);

        myqueue.insert(1);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insert(2);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insert(3);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insert(4);
        System.out.println("the value at front is " + myqueue.start());

        myqueue.insert(5);
        System.out.println("the value at front is " + myqueue.start());

        System.out.println("the value at rear is " + myqueue.end());

        myqueue.delete();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.delete();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.delete();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.delete();
        System.out.println("the value at front is " + myqueue.start());

        myqueue.delete();
        System.out.println("the value at front is " + myqueue.start());

    }
}
