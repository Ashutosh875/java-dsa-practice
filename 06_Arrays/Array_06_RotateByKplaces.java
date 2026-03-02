public class Array_06_RotateByKplaces {

  // brute force TC= O(k*N)
  public static void rotate(int[] nums , int k){
    int n = nums.length;
    k = k%n;
    while(k != 0){
      int temp = nums[n-1];
      for(int i=n-1; i>=1; i--){
        nums[i] = nums[i-1];
      }
      nums[0] = temp;
      k--;
    }
  }

  //Optimized TC = O(2N) and Sc = O(1)
  public static void optRotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rev(nums , 0 , n-1);
        rev(nums , 0 , k-1);
        rev(nums , k , n-1);
    }

  public static void rev(int[] nums, int i, int j){
      while( i<j){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          i++;
          j--;
      }
    }
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5,6,7};
    int k = 3;
    optRotate(arr, k);

     //print
    for(int i : arr){
      System.out.print(i + " ");
    }

  }
}
