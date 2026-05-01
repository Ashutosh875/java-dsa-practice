import java.util.Arrays;

public class Str_05_LongestCommonPrefix {

  public static String brt(String[] strs) {

    String text = "";
    String word = strs[0];

    for (int i = 1; i < strs.length; i++) {

      int len;
      if (word.length() > strs[i].length()) {
        len = strs[i].length();
      } else
        len = word.length();

      for (int j = 0; j < len; j++) {
        if (word.charAt(j) == strs[i].charAt(j)) {
          text += word.charAt(j);
        } else
          break;
      }

      word = text;
      text = "";
    }

    return word;
  }

  public static String opt(String[] strs) {
    Arrays.sort(strs);
    StringBuilder result = new StringBuilder();
    int len;

    if (strs[0].length() > strs[strs.length - 1].length()) {
      len = strs[strs.length - 1].length();
    } else
      len = strs[0].length();

    for (int i = 0; i < len; i++) {
      if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
        break;
      } else
        result.append(strs[0].charAt(i));
    }

    return result.toString();
  }

  public static void main(String[] args) {

    String[] strs = { "flower", "flow", "flight" };

    System.out.println(brt(strs));
    System.out.println(opt(strs));
  }

}
