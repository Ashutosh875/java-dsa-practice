public class Str_11_IsomorphicStrings {

  public static boolean opt(String s, String t) {

    if (s.length() != t.length())
      return false;

    boolean[] isVisited = new boolean[256];
    boolean[] isUsed = new boolean[256];
    char[] map = new char[256];

    for (int i = 0; i < s.length(); i++) {

      if (!isVisited[s.charAt(i)]) {
        if (isUsed[t.charAt(i)])
          return false;
        map[s.charAt(i)] = t.charAt(i);
        isVisited[s.charAt(i)] = true;
        isUsed[t.charAt(i)] = true;
      } else {
        if (map[s.charAt(i)] != t.charAt(i))
          return false;
      }
    }

    return true;
  }

  public static boolean alsoOpt(String s, String t) {
    if (s.length() != t.length())
      return false;

    int[] mapS = new int[256];
    int[] mapT = new int[256];

    for (int i = 0; i < s.length(); i++) {

      char c1 = s.charAt(i);
      char c2 = t.charAt(i);

      if (mapS[c1] != mapT[c2])
        return false;

      mapS[c1] = i + 1;
      mapT[c2] = i + 1;
    }

    return true;
  }

  public static void main(String[] args) {

    System.out.println(opt("abcd", "xyxy"));

    // there should be bi-directional mapping
  }
}
