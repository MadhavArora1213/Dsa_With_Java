// A
// A B
// A B C
// A B C D
// A B C D E


package Patterns_Problems;

public class Problem14 {
    public static void main(String[] args) {
        int n =5;
        int alph =65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alph + j) + " ");
            }
            System.out.println();
        }
    }
}
