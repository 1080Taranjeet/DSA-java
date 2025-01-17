import java.util.Scanner;

public class BinarySearch {

    static int Count = 1;

    public static void display(int[] value){
        for(int i=0;i<value.length;i++){
            System.out.print(value[i] + "\t");
        }
        System.err.println();
    }

    public static int Search(int[] value, int find) {
        int start = 0, end = value.length - 1;
        int mid = (start + end) / 2;

        while (value[mid] != find && start != end) {

            Count ++;

            if (value[mid] < find) {
                start = mid;
                mid = (start + end) / 2;
            } else {
                end = mid;
                mid = (start + end) / 2;
            }

        }
        if (start == end)
            return -1;
        return mid;
    }

    public static void main(String[] args) {

        System.err.println("this is the BinarySearch program");

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

        display(array);

        System.err.println("Enter the value to be searched");
        Scanner ref1 = new Scanner(System.in);
        int value = ref1.nextInt();

        int index = Search(array, value);

        System.err.println("The value " + value + " is at the Index: " + index);
        System.err.println("The no. of the iterations is  " + Count + " for input size: " + array.length);

    }
}