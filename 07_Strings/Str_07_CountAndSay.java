public class Str_07_CountAndSay {

  public static String countAndSay(int n) {
    if (n == 1)
      return "1";
    return rec(n);
  }

  public static String rec(int n) {
    if (n == 1)
      return "1";
    String y = rec(n - 1);
    return countAndSaySequence(y);
  }

  public static String countAndSaySequence(String strValue) {

    StringBuilder sb = new StringBuilder();
    int count = 1;
    char j = strValue.charAt(0);

    for (int i = 1; i < strValue.length(); i++) {

      if (j != strValue.charAt(i)) {
        sb.append(count);
        sb.append(j);
        count = 1;
        j = strValue.charAt(i);
      } else
        count++;
    }
    sb.append(count);
    sb.append(j);

    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(countAndSay(4));
  }
}
