//     *
//    * *
//   * * *
//  * * * *
// * * * * *



package Patterns_Problems;

public class Problem6 {
    public static void Pyramid_Pattern(int n){
        for (int i = 1; i <= n; i++) {
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
       Pyramid_Pattern(5);
    }
}
