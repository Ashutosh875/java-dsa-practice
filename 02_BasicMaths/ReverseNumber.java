public class ReverseNumber {
  public static void main(String[] args) {
    int num = 1534236469;
    int sign = Integer.signum(num);
    num = sign * num;
    int reverseNumber = 0;
    while (num != 0) {
      int n = num%10;
      num = num/10;

    if((reverseNumber > Integer.MAX_VALUE/10) || (reverseNumber < Integer.MIN_VALUE/10)) {
        reverseNumber = 0;
        break;
      } 
      reverseNumber = (reverseNumber * 10) + n;
    }
    
    System.out.println(sign*reverseNumber);
  }
}
