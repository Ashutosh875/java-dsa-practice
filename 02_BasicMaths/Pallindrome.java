public class Pallindrome {

  public static boolean checkPallindrome(int x){
      int dup = x;
      int sign = Integer.signum(x);
      int rev = 0;
      while(x!=0){
          int n = x%10;
          x = x/10;
          if(rev > Integer.MAX_VALUE) return false;
          if(rev < Integer.MIN_VALUE) return false;
          rev = (rev * 10) + n;
      }
      return (sign*rev) == dup;
  }
  public static void main(String[] args) {
    
    System.out.println(checkPallindrome(-121));
  }
}
