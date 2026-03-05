import java.util.HashMap;

class TwoSum{

  /* 
    BRUTE FORCE
    time complexity = O(N²)
  */
  public int[] bruteForce(int[] nums, int target){

    int n = nums.length;
    int[] output = new int[2];

    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        if( (nums[i] + nums[j]) == target){
            output[0] = i;
            output[1] = j;
            return output;
        }
      }
    }
    return output;
  }


  /* 
    OPTIMIZED
    time complexity = O(NlogN)
    space complexity = O(N)
  */
 public int[] optimized(int[] nums, int target){

  int n = nums.length;
  HashMap<Integer,Integer> hashMap = new HashMap<>();

  for(int i=0; i<n; i++){
    int other = target - nums[i];

    if(hashMap.containsKey(other)){
      return new int[] {hashMap.get(other),i};
    }

    hashMap.put(nums[i], i);
    
  }
  return new int[] {-1,-1};
 }

}

public class LC_01_TwoSum {
  public static void main(String[] args) {
    
    int[] arr = {2,7,5,3};
    TwoSum twoSum = new TwoSum();

    twoSum.bruteForce(arr, 9);

    twoSum.optimized(arr, 12);

  }
}
