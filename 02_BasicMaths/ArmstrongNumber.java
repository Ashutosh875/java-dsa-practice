public class ArmstrongNumber {
   public static boolean armStrongNumber(int n){
    int temp = n;
    int extract = 0;
    while(n!=0){
      int x = n%10;
      n = n/10;
      if(n <=100 && n >1000) return false;
      extract = extract + (x*x*x);
    }
    return temp == extract;
  }
  public static void main(String[] args) {
    boolean result = armStrongNumber(371);
    System.out.println(result);
  }
}
