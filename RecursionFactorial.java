public class RecursionFactorial {
  public static void main(String[] args) {
    System.out.println(doFactorial(5));
  }
  
  public static int doFactorial(int n) {
    if(n == 0) {
      return 1;
    }
    
    return n * doFactorial(n-1);
  }
}
