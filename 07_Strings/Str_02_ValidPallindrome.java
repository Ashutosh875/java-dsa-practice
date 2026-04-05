public class Str_02_ValidPallindrome {

  public static boolean opt(String s) {

    s = s.toLowerCase();
    int left = 0, right = s.length() - 1;

    while (left < right) {

      char c1 = s.charAt(left);
      char c2 = s.charAt(right);

      if (!((c1 >= 'a' && c1 <= 'z') || (c1 >= '0' && c1 <= '9'))) {
        left++;
        continue;
      }

      if (!((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9'))) {
        right--;
        continue;
      }

      if (c1 == c2) {
        left++;
        right--;
      } else
        return false;

    }

    return true;
  }

  public static void main(String[] args) {

    String text = "race : car";

    System.out.println(opt(text));
  }
}
