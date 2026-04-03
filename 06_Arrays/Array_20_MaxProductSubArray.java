public class Array_20_MaxProductSubArray {

  // TC = O(N^2) AND SC = O(1)
  public static int brute(int[] nums) {

    int maxProduct = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      int product = 1;
      for (int j = i; j < nums.length; j++) {
        product *= nums[j];
        maxProduct = Integer.max(maxProduct, product);
      }
    }

    return maxProduct;
  }

  // TC = O(N) AND SC = O(1)
  public static int optimized(int[] nums) {

    int maxProduct = Integer.MIN_VALUE;
    int prefix = 1;
    int suffix = 1;

    for (int i = 0; i < nums.length; i++) {

      if (prefix == 0)
        prefix = 1;
      if (suffix == 0)
        suffix = 1;

      prefix *= nums[i];
      suffix *= nums[nums.length - i - 1];

      maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));

    }

    return maxProduct;

  }

  public static void main(String[] args) {

  }
}
