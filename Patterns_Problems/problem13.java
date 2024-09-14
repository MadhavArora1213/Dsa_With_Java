// * * * * * 
// * *   * *
// *   *   *
// * *   * *
// * * * * *

package Patterns_Problems;

public class problem13 {
    public static void Hollow_Square_With_Diagonal(int n) {
        for (int i = 1; i <= n; i++) {
            // Inner loop for each column
            for (int j = 1; j <= n; j++) {
                // Print '*' for borders and diagonals
                if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Print spaces in between
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Square_With_Diagonal(5);
    }
}
