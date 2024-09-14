// *
// * *
// * * *
// * * * *
// * * * * *

package Patterns_Problems;

public class Problem2 {

    public static void Right_Angled(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Right_Angled(5);
    }
}
