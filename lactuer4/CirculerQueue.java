package lactuer4;

public class CirculerQueue {
    private static int[] arr;
    private static int front, rear;

    CirculerQueue(int size) {
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    void insert(int val) {
        if(rear == -1){
            System.out.println("the queue is full");
            return;
        }
        rear = val;
        rear = (rear + 1) % arr.length;
        if(rear == front){
            rear = -1;
        }
    }

    void delete() {
        if(front == -1){
            System.out.println("the queue is empty");
            return;
        }
        front = (front + 1) % arr.length;
        if(front == rear){
            front = -1;
        }
    }

    int start() {
        if(front == -1){
            System.out.println("the queue is empty");
            return -1;
        }
        return arr[front];
    }

    int end() {
        if(front == -1){
            System.out.println("the queue is empty");
            return -1;
        }
        if(rear == -1){
            return arr[((front-1) % arr.length)% arr.length];
        }
        return arr[((rear-1) % arr.length)% arr.length];
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
