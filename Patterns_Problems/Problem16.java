// 1 2 3 4 5 6 7 8 9 
//   1 2 3 4 5 6 7
//     1 2 3 4 5
//       1 2 3
//         1
//       1 2 3
//     1 2 3 4 5
//   1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 9

package Patterns_Problems;

public class Problem16 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
