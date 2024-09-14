//     1
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5



package Patterns_Problems;

public class Problem10 {
    public static void Number_Pyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Number_Pyramid(5);
    }
}
