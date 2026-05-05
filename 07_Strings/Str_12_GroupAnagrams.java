import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Str_12_GroupAnagrams {

  public static List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> freqMap = new HashMap<>();

    for (String s : strs) {

      String freqOfChars = getCharFreq(s);

      if (freqMap.containsKey(freqOfChars)) {
        freqMap.get(freqOfChars).add(s);
      } else {
        List<String> list = new ArrayList<>();
        list.add(s);
        freqMap.put(freqOfChars, list);
      }

    }

    return new ArrayList<>(freqMap.values());
  }

  public static String getCharFreq(String str) {

    StringBuilder sb = new StringBuilder();

    int[] charfreq = new int[26];

    for (char c : str.toCharArray()) {
      charfreq[c - 'a']++;
    }

    char c = 'a';
    for (int i : charfreq) {
      sb.append(c);
      sb.append(i);
      c++;
    }

    return sb.toString();
  }

  public static List<List<String>> optGroupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {

      char[] strArr = str.toCharArray();
      Arrays.sort(strArr);
      String key = new String(strArr);

      map.putIfAbsent(key, new ArrayList<String>());
      map.get(key).add(str);
    }

    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {

    String[] strs = {"cat" , "pat" , "act" , "tap" , "lat"};

    optGroupAnagrams(strs);
  }
}
