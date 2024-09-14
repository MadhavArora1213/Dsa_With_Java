// *****
// *****
// *****
// *****
// *****





package Patterns_Problems;
public class Problem1 {
    public static void Star_Pattern(int n){
        for(int i =0; i<n;i++){
           for(int j =0; j<n; j++){
            System.out.print("* ");

           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
Star_Pattern(5);
    }
}
