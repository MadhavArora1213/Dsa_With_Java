
// * * * * *
// * * * *
// * * *
// * *
// *

package Patterns_Problems;

public class Problem3 {
    public static void Inverted_Right_Angled(int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Inverted_Right_Angled(5);
        
    }
}
