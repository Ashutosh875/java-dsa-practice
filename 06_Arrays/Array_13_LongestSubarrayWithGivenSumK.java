public class Array_13_LongestSubarrayWithGivenSumK {

  public static int bruteLSubArrSumK(int[] nums , int k){

    int len = 0;

    for(int i=0; i<nums.length; i++){
      int sum = 0;
      for(int j=i; j<nums.length; j++){
        sum += nums[j];
        if(sum == k) len = Integer.max(len, (j-i)+1);
      }
    }

    return len;
  }
  public static void main(String[] args) {
    
    int[] arr = {1,3,2,1,1,2,3};
    int k = 6;

    System.out.println(bruteLSubArrSumK(arr, k));
    
  }
  
}
