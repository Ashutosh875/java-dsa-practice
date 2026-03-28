import java.util.ArrayList;
import java.util.List;

public class Array_19_PlusOne {


  //TC = O(N) && SC = O(N)
  public static int[] brute(int[] digits) {

    int carry = 1;
    int temp = 0;

    List<Integer> list = new ArrayList<>();

    for (int i = digits.length - 1; i >= 0; i--) {

      digits[i] = digits[i] + carry;

      if (digits[i] > 9) {
        temp = digits[i] % 10;
        carry = digits[i] / 10;
      } else {
        temp = digits[i];
        carry = 0;
      }

      list.add(temp);

    }

    if (list.get(list.size() - 1) == 0) {
      list.add(1);
    }

    int[] resultArr = new int[list.size()];

    int j = 0;
    for (int i = list.size() - 1; i >= 0; i--) {

      resultArr[j] = list.get(i);
      j++;
    }

    return resultArr;
  }

  //TC = O(N) && SC = O(1) , excluding output array
  public static int[] optimized(int[] digits) {

    for (int i = digits.length - 1; i >= 0; i--) {

      if (digits[i] < 9) {
        digits[i]++;
        return digits;
      }

      digits[i] = 0;
    }

    int[] newDigits = new int[digits.length + 1];
    newDigits[0] = 1;
    return newDigits;
  }

  public static void main(String[] args) {

    int[] arr = {9,9,9};

    brute(arr);
    optimized(arr);
  }
}
