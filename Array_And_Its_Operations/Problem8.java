// Given a string , the task is chcek whether given string is palindrome or not
package Array_And_Its_Operations;

public class Problem8 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //priting array element after each iteration
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        char[] chararray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (chararray[left] != chararray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        if(isPalindrome("that")){
            System.out.println("The given string is a palindrome");
        }else{
            System.out.println("The given string is not a palindrome");
        }
    }
}
