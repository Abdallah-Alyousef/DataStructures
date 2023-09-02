public class Recursion {


  public static int factorial(int n) {
    if(n == 1) {
      return 1;
    }
    return n*factorial(n-1);
  }
  public static int sum(int n) {
    if(n==0) {
        return 0;
    }
    return n + sum(n-1);
  }

  
}
