//  How to resize an array in java
package Array_And_Its_Operations;

public class Problem6 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }

    public static int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int idx = 0; idx < arr.length; idx++) {
            temp[idx] = arr[idx];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9};
        printArray(arr);
        System.out.println("The original size of the array is " + arr.length);
        int[] newarr = resizeArray(arr,arr.length*2);
        printArray(newarr);
        System.out.println("The original size of the newarray is " + newarr.length);

    }
}
