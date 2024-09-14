// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


package Patterns_Problems;

public class Problem9 {
    public static void Floyd_Triangle(int n){
        int num = 1;  
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;  
            }
           
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Floyd_Triangle(5);
    }
}
