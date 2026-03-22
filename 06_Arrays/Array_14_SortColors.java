public class Array_14_SortColors {

  // Tc = O(N^2)
  public static void brtSortColors(int[] nums){

    for(int i=0; i<nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
        if(nums[i] > nums[j]){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }

  }

  //Tc = O(N)
  public static void optSortColors(int[] nums){

    int low = 0 , mid = 0 , high = nums.length-1;

      while(mid <= high){

        if(nums[mid] == 0){
          int temp = nums[low];
          nums[low] = nums[mid];
          nums[mid] = temp;
          low++;
          mid++;
        } else if (nums[mid] == 1){
            mid++;
          } else{
              int temp = nums[mid];
              nums[mid] = nums[high];
              nums[high] = temp;
              high--;
            }
      }

  }

  public static void main(String[] args) {
    
    int[] arr = {2,0,2,1,1,0};

    brtSortColors(arr);
    optSortColors(arr);
  }
}
