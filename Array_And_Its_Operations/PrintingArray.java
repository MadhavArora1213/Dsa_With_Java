package Array_And_Its_Operations;

public class PrintingArray {

    static void print(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[] array = {1, 2, 3, 4, 5};
        
        // System.out.println("Printing array elements:");
        // for(int i =0; i<array.length; i++){
        //     System.out.print(array[i] + " "); //priting array element after each iteration
        // }
        

        print(new int[] {1, 2, 3, 4, 5});   // Another syntax to pass an array value
    }
}
