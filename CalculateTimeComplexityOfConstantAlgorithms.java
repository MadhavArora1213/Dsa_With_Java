public class CalculateTimeComplexityOfConstantAlgorithms {
    public static void main(String[] args) {
        CalculateTimeComplexityOfConstantAlgorithms demo = new CalculateTimeComplexityOfConstantAlgorithms();
        System.out.println(demo.sum(8,9));
    }
    public int sum(int a, int b){
        int result = a+b;      // ------>>>>>> Time cpomplexity of this line is  1+1+1+1 because it takes 1 nit of time to access a and 1 unit time takes to access b and 1 unit of time to initialix=ze and access result variable and 1 unit of time takes to assignment operation and arthimetic opertaion so total takes 4 unit of time.


        return result;        // ------>>>>> Time Complexity of this line is 1+1 beacuse it takes 1 unit of time to access the result variable and 1 unit of time takes to perform return operation.So, totral it takes 2 unit of time.

        //So these two statements take total 6 units of time to perform an operation that equivalents to the constant time T = 4+2 = 6 ~ Constant ->> O(1) Constant time complexity.
    }
}
