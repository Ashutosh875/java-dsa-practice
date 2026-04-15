import java.util.ArrayList;
import java.util.List;

public class Str_04_ReverseWords {

  public static String brute(String s) {

    char[] c = s.toCharArray();
    List<String> list = new ArrayList<>();

    String text = "";

    for (int i = 0; i < c.length; i++) {

      if (c[i] != ' ') {
        text = text + c[i];
      } else {
        if (!text.isEmpty())
          list.add(text);
        text = "";
      }
    }

    if (!text.isEmpty())
      list.add(text);
    String res = "";

    for (int i = list.size() - 1; i >= 0; i--) {

      res = res + list.get(i);
      if (i != 0)
        res += " ";
    }

    return res;
  }

  public static String better(String s) {

    String[] words = s.trim().split("\\s+");

    String res = "";

    for (int i = words.length - 1; i >= 0; i--) {

      res += words[i];
      if (i != 0)
        res += " ";
    }

    return res;
  }

  public static String opt(String s) {

    String[] x = s.trim().split("\\s+");

    StringBuilder out = new StringBuilder();

    for (int i = x.length - 1; i >= 0; i--) {
      out.append(x[i]);
      if (i != 0)
        out.append(" ");
    }

    return out.toString();
  }

  public static String opt2(String s) {

    int i = s.length() - 1;
    StringBuilder res = new StringBuilder();

    while (i >= 0) {

      while (i >= 0 && s.charAt(i) == ' ') {
        i--;
      }
      if (i < 0)
        break;

      int end = i;

      while (i >= 0 && s.charAt(i) != ' ') {
        i--;
      }

      if (res.length() > 0)
        res.append(" ");
      String word = s.substring(i + 1, end + 1);
      res.append(word);
    }

    return res.toString();
  }

  public static void main(String[] args) {

    String text = "  hello    world  ";

    System.out.println(better(text));
  }
}
