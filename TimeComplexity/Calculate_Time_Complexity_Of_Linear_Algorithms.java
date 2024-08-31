public class Calculate_Time_Complexity_Of_Linear_Algorithms {
    public static void main(String[] args) {
        Calculate_Time_Complexity_Of_Linear_Algorithms demo = new Calculate_Time_Complexity_Of_Linear_Algorithms();
        System.out.println(demo.FindSum(3));
    }

//This Block of code takes n times to execute because of for loop that why its time complexity is O(n)--> The Linear Time Complexity.

    public int FindSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
}
