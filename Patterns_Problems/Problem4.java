// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


package Patterns_Problems;

public class Problem4 {
    public static void Number_Triangle(int n){
        for(int i =1; i<=n;i++){
            for(int j =1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();  
        }
    }
    public static void main(String[] args) {
        Number_Triangle(5);
    }
}
