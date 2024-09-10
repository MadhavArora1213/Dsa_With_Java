// Given an array of integers, write a function to move all 0's to ed of it while maintaining the relative order of the non-zero elements.
package Array_And_Its_Operations;

public class Problem5 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }

    public static void Move(int[] arr, int n) {
        int j = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != 0 && arr[j] == 0) {
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;

            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 12};
        printArray(arr);
        Move(arr,arr.length);
        printArray(arr);
    }
}
