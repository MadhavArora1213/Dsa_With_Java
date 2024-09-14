// * * * * *
//  * * * *
//   * * *
//    * *
//     *


package Patterns_Problems;

public class Problem7 {
    public static void Inverted_Pyramid_Pattern(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        Inverted_Pyramid_Pattern(5);
    }
}
