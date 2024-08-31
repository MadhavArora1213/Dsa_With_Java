package SpaceComplexity;

public class ConstantSpaceComplexity {
    public static void main(String[] args) {
        add(8,9);
    }

    //    let  n1->>  4 bytes
    //   n2->> 4 bytes
    //   sum ->> 4 bytes
    //   auxiliary space->> 4 bytes
    // total it takes 16 bytes that is constant so the space complexity of this block of code is O(1) -> that is constant space complexity.

    static int add(int a,int b){
        int sum = a + b;
        return sum;
    }
}
