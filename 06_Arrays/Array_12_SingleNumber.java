import java.util.HashMap;
import java.util.Map;

public class Array_12_SingleNumber {

  // Tc = O(NlogM) + O(N/2 + 1)
  // Sc = O(N/2 + 1)
  public static int bruteSingleNumber(int[] nums){

      int num = 0;

      HashMap<Integer,Integer> map = new HashMap<>();
      
      for(int i=0; i<nums.length; i++){
          map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
      }

      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue().equals(1)){
            num = entry.getKey();
        }
      }

      return num;
  }

  // Tc = O(N)
  // sc = O(1)
  public static int optSingleNumber(int[] nums){

    int xor = 0;

    for(int i : nums){
      xor = xor ^ i;
    }

    return xor;
  }


  public static void main(String[] args) {
    
    int[] nums = {4,1,2,1,2};

    int bruteRes = bruteSingleNumber(nums);
    int optRes = optSingleNumber(nums);
    
    System.out.println(bruteRes + " " + optRes);
  }
}
