package Array_And_Its_Operations;

public class AddingOrUpdatingInArray {
    public static void main(String[] args) {
        // Initialize an array with 5 elements and update the value at index 2 to .

        int[] arr = new int[5];
        arr[0]= 5;
        arr[1]= 10;
        arr[2]= 15;
        arr[3]= 20;
        arr[4]= 25;
        arr[2] = 4;
        // arr[5] = 3;    return an error that java.lang.ArrayIndexOutOfBoundsException: index 5 out of bounds for length 5.
        System.out.println(arr.length);  // length method is used to get the number of elements in the array
        System.out.println("Original Array:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
