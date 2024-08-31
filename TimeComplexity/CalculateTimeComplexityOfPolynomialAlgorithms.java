public class CalculateTimeComplexityOfPolynomialAlgorithms {
    public static void main(String[] args) {
        CalculateTimeComplexityOfPolynomialAlgorithms demo = new CalculateTimeComplexityOfPolynomialAlgorithms();
        demo.print(5);

    }

    //This Block of code takes n*n times to execute because of for loop inside the for loop that why its time complexity is O(n^2)--> The Polynomial Time Complexity taht is really a bad time complexity.
    public void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println("i = " + i + ",  j = " + j);
            }
            System.out.println("End of the inner loop");
        }
        System.out.println("End of the outer loop");
    }
}
