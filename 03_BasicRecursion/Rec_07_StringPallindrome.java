public class Rec_07_StringPallindrome {

  public static boolean isPallindrome(String text , int i){
    String temp = text.toLowerCase();
    int len = temp.length();
    if(i >= len/2) return true;
    if(temp.charAt(i) != temp.charAt(len-i-1)) return false;
    return isPallindrome(temp, i+1);
  }
  public static void main(String[] args) {
    
    System.out.println(isPallindrome("MaDaM", 0));
  }
}
