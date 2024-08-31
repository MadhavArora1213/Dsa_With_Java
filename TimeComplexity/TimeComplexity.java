public class TimeComplexity {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexity demo = new TimeComplexity();    // You can access the public function using the object that class.
        System.out.println(demo.FindSum(99999));
        System.out.println("Time Taken - " + (System.currentTimeMillis() - now) + "millisecs.");
    }
    
    // O(n) Time Complexity - Linear Time Complexity   -> We can calculate the time complexity here its take 2 millisecs to run this code.

    public int FindSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    // O(1) Time Complexity - Constant Time Complexity -> We can calculate the time complexity here its take 1 millisecs to run this code.

    // public int FindSum(int n){
    //         return n*(n+1)/2;
    //     }
}
