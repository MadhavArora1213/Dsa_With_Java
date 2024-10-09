// Peak index of mountain array
package LeetCode_Array_And_BinarySearch;

public class Problem852{
    public int peakIndexInMountainArray(int[] arr) {
        int st =1, end = arr.length -2;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid-1] <  arr[mid]){
                st = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
    
    }
}