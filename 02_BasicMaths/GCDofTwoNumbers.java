public class GCDofTwoNumbers {

  public static int gcdOf(int n , int m){

    while(n>0 && m>0){
      if(n>m) {
        n = n%m;
      }else m = m%n;
      
    }
    if(n == 0) return m;
    return n;
  }
  public static void main(String[] args) {
    
    int result = gcdOf(12, 15);
    System.out.println(result);
  }
}
