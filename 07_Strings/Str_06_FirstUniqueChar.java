import java.util.HashMap;

public class Str_06_FirstUniqueChar {

  public static int brt(String s) {
    char[] c = s.toCharArray();

    if (c.length == 1) {
      return 0;
    }

    for (int i = 0; i < c.length; i++) {

      boolean isUnique = true;

      for (int j = 0; j < c.length; j++) {
        if (i == j)
          continue;

        if (c[i] == c[j]) {
          isUnique = false;
          break;
        }
      }

      if (isUnique)
        return i;
    }

    return -1;
  }

  public static int map(String s) {
    HashMap<Character, Integer> freqMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      int count = freqMap.get(s.charAt(i));
      if (count == 1)
        return i;
    }

    return -1;
  }

  public static int opt(String s) {
    int[] freq = new int[26];

    for (char c : s.toCharArray()) {
      freq[c - 'a']++;
    }

    for (int i = 0; i < s.length(); i++) {
      if (freq[s.charAt(i) - 'a'] == 1)
        return i;
    }

    return -1;
  }

  public static void main(String[] args) {

    String s = "google";
    System.out.println(brt(s));
    System.out.println(map(s));
    System.out.println(opt(s));
  }
}
