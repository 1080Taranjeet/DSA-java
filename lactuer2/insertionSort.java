package lactuer2;

import java.util.Scanner;

public class insertionSort {
    private static int size;
    private static Scanner ref = new Scanner(System.in);

    static int[] CreateArray(int size){
        System.out.print("Enter the elements in the array = ");
        int[] array = new int[size] ;
        for(int i = 0 ; i < size ; i ++ ){
            array[i] = ref.nextInt();
        }
        return array;
    }

    static int[] Sort(int[] array){
        //the main loop goes till the end of the array with i
        for(int i = 1; i < array.length ; i++){

            //the second loop starts from first till the i
            for(int j = 0 ; j < i ; j++ ){

                //if the i is smaller then the j 
                if(array[j] > array[i]){

                    int data = array[j];
                    array[j] = array[i];

                    //shift the values of the i and j 
                    while (j < i) {
                        j++;                        
                        int val = array[j];
                        array[j] = data;
                        data = val;

                    }

                }

            }
        }
        return array;
    }

    static void display(int[] array) {
        System.out.print("the array is = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t" );
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
        display(Sort(array));

    }
}
