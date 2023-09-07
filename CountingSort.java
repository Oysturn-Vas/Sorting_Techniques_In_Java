import java.util.*;
public class CountingSort {
    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        //find the largest element so that we can initialize the count array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        //initialising the count array
        int count[] = new int[largest + 1];

        //add the frequency at that location in the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //use the frequency count array to alter the original array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]) {
        int sort[] = { 1,4,1,3,2,4,3,7};
        counting(sort);
        printArray(sort);
    }
}
