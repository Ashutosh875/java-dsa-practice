public class Array_16_MaxSubArraySum {

  //Tc = O(N^2) 
  public static int brtMaxSum(int[] nums){

    int maxSum = Integer.MIN_VALUE;

    for(int i=0; i<nums.length; i++){
      int sum = 0;
      for(int j=i; j<nums.length; j++){
        sum += nums[j];
        maxSum = Integer.max(maxSum, sum);
      }
    }

    return maxSum;
  }

  //Tc = O(N)
  // returns array with with start and end index 
  // of sub-array with maximum sum
  public static int[] optMaxSum(int[] nums){

    int maxSum = Integer.MIN_VALUE;
    int sum = 0 , start = -1;

    int[] arr = new int[3];

    for(int i=0; i<nums.length; i++){

      if(sum == 0) start = i;

      sum += nums[i];

      if(sum >= maxSum){
        maxSum = sum;
        //first-index
        arr[0] = start;
        //last-index
        arr[1] = i;
        //max-sum
        arr[2] = maxSum;
      }

      if(sum < 0) sum = 0;
    }

    return arr;
  }
  public static void main(String[] args) {

    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

    // System.out.println(brtMaxSum(nums));
    
    int[] arr = optMaxSum(nums);
    
    //print 
    for(int i : arr){
      System.out.println(i);
    }

    
  }
}
