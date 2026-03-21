import java.util.HashMap;
import java.util.Map;

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

   public static int optLSubArrSumK(int[] nums , int k){

    int sum = 0;
    int len = 0;

    Map<Integer,Integer> hash = new HashMap<>();
    hash.put(0,1);

    for(int i=0; i<nums.length; i++){

      sum += nums[i];

      int target = sum-k;

      if(sum == k) { len = i + 1; }

      if(hash.containsKey(target)) {len = Integer.max(len, i-hash.get(target));}

      if(!hash.containsKey(target)) {hash.put(sum, i);}
      
    }

    return len;
    
   }

  public static void main(String[] args) {
    
    int[] arr = {1,1,0,0,0};
    int k = 0;

    System.out.println(bruteLSubArrSumK(arr, k));

    System.out.println(optLSubArrSumK(arr, k));
    
  }
  
}
