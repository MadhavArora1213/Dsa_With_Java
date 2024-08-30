public class BasicAlgorithms{
  static void func(float a,float b, float c){    //Not use public keyword if you use it give an error
    float sum =a + b + c;
    System.out.println("Sum of the given numbers: "+sum);
    float avg = sum / 3;
    System.out.println("Average of the given numbers: "+avg);
  }

  public static void main(String[] args){
    func(6,8,9);
  }
  
}