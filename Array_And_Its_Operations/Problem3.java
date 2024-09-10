// Find minimum value in an array
package Array_And_Its_Operations;

public class Problem3 {

    public static int minimum(int[] array) {
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 4, 15, 6};
        System.out.println(minimum(array));
    }
}
