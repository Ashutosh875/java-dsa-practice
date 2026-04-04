import java.util.HashMap;
import java.util.Map;

public class Str_01_ValidAnagram {

  //TC = O(3N) AND SC = O(N)
  public static boolean brute(String s, String t) {

    if (s.length() != t.length())
      return false;

    Map<Character, Integer> sCharFreq = new HashMap<>();

    for (char c : s.toCharArray()) {

      sCharFreq.put(c, sCharFreq.getOrDefault(c, 0) + 1);
    }

    for (char c : t.toCharArray()) {
      sCharFreq.put(c, sCharFreq.getOrDefault(c, 0) - 1);
    }

    for (Map.Entry<Character, Integer> entry : sCharFreq.entrySet()) {
      if (entry.getValue() != 0)
        return false;
    }

    return true;

  }


  //TC = O(N) AND SC = O(1)
  public static boolean opt(String s , String t){

    if(s.length() != t.length()) return false;

    char[] freq = new char[26];

    for(int i=0; i<s.length(); i++){
      freq[s.charAt(i) - 'a']++;
      freq[t.charAt(i) - 'a']--;
    }

    for(int f : freq) { if (f != 0) return false;}
    return true;
    
  }



  public static void main(String[] args) {

  }
}
