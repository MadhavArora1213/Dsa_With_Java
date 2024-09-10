// Find the second maximum value in an array

package Array_And_Its_Operations;

public class Problem4 {

    public static int SecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i]!= max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {10,43,23,12,10,5};
        System.out.println(SecondMax(arr));
    }
}
