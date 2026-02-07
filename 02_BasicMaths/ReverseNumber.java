public class ReverseNumber {
  public static void main(String[] args) {
    int num = -456780;
    int sign = Integer.signum(num);
    num = sign * num;
    int reverseNumber = 0;
    while (num != 0) {
      int n = num%10;
      num = num/10;
      reverseNumber = (reverseNumber * 10) + n;
    }
    System.out.println(sign*reverseNumber);
  }
}
