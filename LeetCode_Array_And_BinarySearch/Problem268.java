// MISSING NUMBER

package LeetCode_Array_And_BinarySearch;

public class Problem268 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }
    public static int FindMissingNumber(int[] arr){
        int n = arr.length + 1; 
        int sum = (n * (n + 1)) / 2;
        for(int num: arr){
            sum = sum - num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        System.out.println("Missing number: " + FindMissingNumber(arr));
    }
}
