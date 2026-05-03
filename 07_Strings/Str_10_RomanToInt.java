import java.util.Map;

public class Str_10_RomanToInt {

  public static int brt(String s) {

    Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
    int num = 0;

    for (int i = 0; i < s.length(); i++) {

      char roman = s.charAt(i);
      int digit = map.get(roman);

      if (i == (s.length() - 1)) {
        num += digit;
      } else if (digit >= map.get(s.charAt(i + 1))) {
        num += digit;
      } else
        num -= digit;

    }

    return num;
  }

  //memory efficient
  public static int opt(String s) {
    int[] map = new int[128];
    map['I'] = 1;
    map['V'] = 5;
    map['X'] = 10;
    map['L'] = 50;
    map['C'] = 100;
    map['D'] = 500;
    map['M'] = 1000;
    int num = 0;

    for (int i = 0; i < s.length(); i++) {

      int digit = map[s.charAt(i)];

      if (i == (s.length() - 1)) {
        num += digit;
      } else if (digit >= map[s.charAt(i + 1)]) {
        num += digit;
      } else
        num -= digit;

    }

    return num;
  }

  public static void main(String[] args) {

    System.out.println("MCMXCIV");
  }
}
