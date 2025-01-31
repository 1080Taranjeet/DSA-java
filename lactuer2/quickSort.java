package lactuer2;

import java.util.Scanner;

public class quickSort {
    private static int size;
    private static Scanner ref = new Scanner(System.in);

    static int[] CreateArray(int size) {
        System.out.print("Enter the elements in the array = ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ref.nextInt();
        }
        return array;
    }

    public static int[] Sort(int[] arr, int left, int right) {
        if (left >= right)
            return arr; // Base case

        int pivot = arr[left];
        int i = left + 1, j = right;

        while (i <= j) {
            while (i <= right && arr[i] < pivot)
                i++;
            while (j > left && arr[j] > pivot)
                j--;
            if (i < j)
                swap(arr, i++, j--);
        }

        swap(arr, left, j);

        Sort(arr, left, j - 1);
        Sort(arr, j + 1, right);

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void display(int[] array) {
        System.out.print("the array is = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Selection sort");

        System.out.print("enter the array size = ");
        size = ref.nextInt();

        int[] array = CreateArray(size);

        display(array);

        System.out.println("the sorted array is = ");
        display(Sort(array, 0, array.length - 1));

    }
}
