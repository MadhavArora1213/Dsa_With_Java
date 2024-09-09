// Given an array or string, the task is to reverese the string or array
package Array_And_Its_Operations;

public class Problem2 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }

    // Onw way of solving a problem
    
    // public static void reverseArray(int[] arr){
    //     for(int i = arr.length - 1; i >= 0; i--){
    //      System.out.print(arr[i]+ " ");
    //     }
    // }

    // Second way of solving a problem
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // One way of solving a problem
        // printArray(arr);
        // reverseArray(arr);
        // Second way of solving a problem
        printArray(arr);
        reverse(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
