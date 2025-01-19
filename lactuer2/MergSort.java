package lactuer2;

import java.util.Scanner;

public class MergSort {
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

    static void display(int[] array) {
        System.out.print("the array is = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static int[] Sort(int[] array) {
        // Base case: if the array has 1 or 0 elements, it's already sorted
        if (array.length <= 1) {
            return array;
        }
    
        // Find the middle index
        int mid = array.length / 2;
    
        // Split the array into two halves
        int[] array1 = new int[mid];
        int[] array2 = new int[array.length - mid];
    
        // Populate array1
        for (int i = 0; i < mid; i++) {
            array1[i] = array[i];
        }
    
        // Populate array2
        for (int i = mid; i < array.length; i++) {
            array2[i - mid] = array[i];
        }
    
        // Recursively sort the two halves
        int[] first = Sort(array1);
        int[] second = Sort(array2);
    
        // Merge the sorted halves
        return merge(first, second);
    }
    
    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
    
        // Merge the two arrays
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }
    
        // Copy any remaining elements from `first`
        while (i < first.length) {
            result[k++] = first[i++];
        }
    
        // Copy any remaining elements from `second`
        while (j < second.length) {
            result[k++] = second[j++];
        }
    
        return result;
    }
    

    public static void main(String[] args) {

        System.out.println("Selection sort");

        System.out.print("enter the array size = ");
        size = ref.nextInt();

        int[] array = CreateArray(size);

        display(array);

        System.out.println("the sorted array is = ");
        display(Sort(array));

    }
}
