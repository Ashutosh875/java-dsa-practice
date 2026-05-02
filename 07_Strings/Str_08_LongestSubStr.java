public class Str_08_LongestSubStr {

  public static int brt(String s) {
    int maxLen = 0;

    for (int i = 0; i < s.length(); i++) {
      boolean[] isVisited = new boolean[256];

      for (int j = i; j < s.length(); j++) {

        if (isVisited[s.charAt(j)])
          break;

        isVisited[s.charAt(j)] = true;
        maxLen = Math.max(maxLen, j - i + 1);
      }
    }

    return maxLen;
  }

  public static int opt(String s) {
    int maxLen = 0;

    int[] freqMap = new int[256];

    for (int i = 0; i < freqMap.length; i++) {
      freqMap[i] = -1;
    }

    int l = 0;

    for (int r = 0; r < s.length(); r++) {

      if (freqMap[s.charAt(r)] >= l) {
        l = freqMap[s.charAt(r)] + 1;
      }

      freqMap[s.charAt(r)] = r;
      maxLen = Math.max(maxLen, r - l + 1);

    }

    return maxLen;
  }

  public static void main(String[] args) {

    int[] map = { 22, 11, 34, 12, };
    System.out.println(map[0]);
  }
}
