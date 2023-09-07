public class InsertionSort {
    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            //while loop is used to find out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]) {
        int sort[] = { 5, 4, 3, 2, 1 };
        insertion(sort);
        printArray(sort);
    }
}
