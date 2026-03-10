public class Array_10_FindMissingNumber {

  public static int findMissingNum(int[] nums){

    //basic loop approach
    
    // for(int i=0; i<nums.length; i++){

    //   if(nums[0] != 1) return 1;
    //   else if( i!=0 && nums[i]-nums[i-1] != 1){
    //     return nums[i] - 1;
    //   }
    // }


    //sum approach
    int n = nums.length+1;
    int sum = (n*(n+1))/2;

    int s=0;
    for(int i=0; i<nums.length; i++){
      s = s + nums[i];
    }

    return sum-s;
  }
  public static void main(String[] args) {
    
    int[] arr = {2,3,4};
    System.out.println(findMissingNum(arr));

  }
}
