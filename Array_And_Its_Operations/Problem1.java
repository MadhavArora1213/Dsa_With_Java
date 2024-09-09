// Given an array of integers, return an array with even integers removed.
// INPUT: arr = {3,2,4,7,10,6,5}
// OUTPUT : arr = {3,7,5}
package Array_And_Its_Operations;

public class Problem1 {

    // One way to solve a problem
    // static void OddArray(int[] arr){
    //     for(int i = 0; i<arr.length;i++){
    //         if(arr[i] % 2!= 0){
    //            System.out.print(arr[i] +" ");
    //         }
    //     }
    // }
    // ANOTHER WAY TO SOLVE THIS PROBLEM
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }

    public static int[] removeEvenNumbers(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] oddArray = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArray[idx] = arr[i]; //storing odd numbers in a new array
                idx++;
            }
        }
        return oddArray;
    }

    public static void main(String[] args) {
        // One way to solve a problem

        // OddArray(new int[] {3,2,4,7,10,6,5});
        //ANOTHER WAY TO SOLVE A PROBLEM
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        printArray(arr);
        int[] result = removeEvenNumbers(arr);
        printArray(result);
    }

}
