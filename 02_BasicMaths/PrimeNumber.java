public class PrimeNumber {

  public static boolean primeCheck(int n){
    int count = 0;
    for(int i = 1 ; i <= Math.sqrt(n) ; i++){
      if(n%i == 0){
        count++;
        if(i != n/i) count++;
      }
    }
    if(count == 2) return true;
    return false;
 }
  public static void main(String[] args) {
    
    System.out.println(primeCheck(17));
  }
}
