public class Rec_08_Fibonacci {

  public static int fibo(int n){
    if(n<=1) return n;
    return fibo(n-1) + fibo(n-2);

  }
  public static void main(String[] args) {
    
    int result = fibo(8);
    System.out.println(result);
  }

  /* 
      RECURSION TREE

                           f(4)
                        /       \
                      f(3)       f(2)
                      /  \        /  \
                  f(2)    f(1)   f(1) f(0)
                  /  \
               f(1)   f(0)
  
  */
}
