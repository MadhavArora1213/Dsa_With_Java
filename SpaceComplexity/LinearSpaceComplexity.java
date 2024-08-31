package SpaceComplexity;
public class LinearSpaceComplexity {
    public static void main(String[] args) {
      System.out.println(FindSum(10));
    }


    //let  we take array have 4 elements so arr --> n*4 bytes
    // sum --> 4 bytes
    // i --> 4 bytes
    // Auxiliary Space --> 4 bytes

    // total  is 4n + 12 neglect 12 and 4 because of constant therefore the Space Complexity become O(n) that is Linear space complexity
    static int FindSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
