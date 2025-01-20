package lactuer3;

import java.util.Scanner;;

public class StackWithArray {

    private static Scanner ref = new Scanner(System.in);

    // insitlize the stack;
    static class stack {
        int top = -1;
        int[] arr;

        stack(int size) {
            this.arr = new int[size];
        }
    }

    static int top(stack mystack){
        if(mystack.top != -1){
            return mystack.arr[mystack.top];
        }else{
            return -1;
        }
    }

    static void push(stack mystack, int val) {
        if (mystack.top < mystack.arr.length) {
            mystack.top++;
            System.out.println("pushed into the stack");
            mystack.arr[mystack.top] = val;
        } else {
            System.out.println("the stack is full ");
        }
    }

    static boolean empty(stack mystack){
        if(mystack.top == -1){
            return true;
        }else{
            return false;
        }
    }

    static void pop(stack mystack) {
        if (mystack.top != -1) {
            System.out.println("poped from the stack");
            mystack.top--;
        } else {
            System.out.println("the stack is already empty");
        }
    }

    public static void main(String[] args) {

        int size = 0;
        System.out.println(" enter the size of the array ");
        size = ref.nextInt();

        stack mystack = new stack(size);

        push(mystack, 2);

        System.out.println("top = " + top(mystack));

        push(mystack, 3);

        System.out.println("top = " + top(mystack));

        pop(mystack);

        System.out.println("top = " + top(mystack));

        System.out.println("is stack empty = "+ empty(mystack));
    }
}
