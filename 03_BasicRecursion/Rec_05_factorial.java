public class Rec_05_factorial {
  /* 
    same as summation of n terms but
    in the base case it should return 1
    because returning 0 will eventually
    result into multiplying all recursion calls 
    with 0 and the final output will be 0
  */
  public static int fact(int n){
  if(n == 0) return 1;
  return n*fact(n-1);
  }
  public static void main(String[] args) {
    
    int res = fact(5);
    System.out.println(res);
  }
}
