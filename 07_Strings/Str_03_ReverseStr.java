public class Str_03_ReverseStr {

  public static void opt(char[] s) {

    int left = 0, right = s.length - 1;

    while (left < right) {

      char temp = s[left];
      s[left++] = s[right];
      s[right--] = temp;
    }
    
  }

  public static void main(String[] args) {

  }
}
